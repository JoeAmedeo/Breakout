import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameScreen extends JPanel implements Runnable, KeyListener{
	private JFrame _gameScreen;
	private volatile boolean _running = true;
	private boolean _winning = true;
	private boolean _collision = false;
	private int _FramesPerSecond = 0;
	private int _score = 1000;
	private int _totalScore = 0;
	private Thread _thread;
	private Container _container;
	private ArrayList<Ball> _ballList = new ArrayList<>();
	private Paddle _paddle;
	protected ArrayList<Brick> _BrickList = new ArrayList<Brick>();
	private boolean _winningStatus = false;
	private BufferedImage img = null;
	public GameScreen(ArrayList<Brick> list){
		loadImage();
		_BrickList = list;
		_gameScreen = new JFrame("Level 1");
		_container = _gameScreen.getContentPane();
		_gameScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_gameScreen.setSize(640, 480);
		this.setPreferredSize(new Dimension(640, 480));
		_container.add(this);
		_gameScreen.pack();
		_paddle = new Paddle(this);
		_ballList.add(new Ball(320, 400, Color.black, this));
		_gameScreen.setVisible(true);
		this.addKeyListener(this);
		this.requestFocusInWindow();
		start();
	}
	
	public void start(){
		_thread = new Thread(this);
		_thread.start();
	}
	@Override
	public void run() {
		_running = true;
		long currentTime = System.currentTimeMillis();
		while(_running){
			_FramesPerSecond++;
			repaint();
			update();
			if((System.currentTimeMillis() - currentTime) > 1000){
				System.out.println("FPS: " + _FramesPerSecond);
				currentTime = System.currentTimeMillis();
				_FramesPerSecond = 0;
				//reduce the players score by 1 for every second that passes
				if(_score > 0){
					_score = _score - 1; //score is reduced by 1 per second
				}
			}
			try {
				Thread.sleep(17); // keep the game at ~60 fps
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		paintImage(g);
		
		
				//prints the score onto the game screen
		g.setFont(new Font(ScoreString(),30,30));
		g.setColor(Color.black);
		g.drawString(ScoreString(), 0, 450);
				//prints ball
		for(int i=0; i<_ballList.size(); i++){
			_ballList.get(i).paint(g);
		}
		
				//prints the paddle
		_paddle.paint(g);
				//prints all bricks in the BrickList array
		for(int i=0; i<_BrickList.size(); i++){
			_BrickList.get(i).paint(g);
		}
	}
	
	private void update(){
		for(int i = 0; i < _ballList.size(); i++){
			if(_ballList.get(i).move() == false){
				_ballList.remove(i);
			}
		}
		
		if(_ballList.isEmpty()){
			_winning = false;
		}
		_paddle.move(_ballList);	 // move the paddle
		if(_BrickList.isEmpty()){ // you win the game if there are no more bricks
			_winning = false;
			_winningStatus = true;
		}
		if(_winning == false){ // if the game ends convert to new screen
			_running = false;
			new WinScreen(_totalScore, _winningStatus);
			_gameScreen.dispose();
		}
		/*
		 * check whole list of bricks to see if one collides with the ball, 
		 * if so remove a hit count, if hit count is reduced to 0 remove the brick from the list
		 */
		for(int i = 0; i < _BrickList.size(); i++){ 
			_collision = _BrickList.get(i).checkCollision(_ballList);
			if(_collision){
					
				_BrickList.get(i).Hit();
				if(_BrickList.get(i).getHits() == 0){
					if(_BrickList.get(i).getCreatesBall()){
						_ballList.add(new Ball(_BrickList.get(i).getX(), _BrickList.get(i).getY(), Color.blue, this ));
					}
					_BrickList.remove(i);
					_totalScore = _totalScore + _score;
					
				}
				break; // end loop if ball is hit. prevents hitting multiple bricks at once and creating weird collisions
			}
		}
		
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		int key = arg0.getKeyCode();
		if(key == KeyEvent.VK_LEFT){
			_paddle.setLeft(true); // move left when hitting the left key
		}else if(key == KeyEvent.VK_RIGHT){
			_paddle.setRight(true); // move right when hitting the right key
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_LEFT){
			_paddle.setLeft(false); // stop moving left when key is released
		}else if(key == KeyEvent.VK_RIGHT){
			_paddle.setRight(false); // stop moving right when key is released
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	public String ScoreString(){ //convert score number to a string for printing purposes
		String s = "Score: " + _totalScore;
		return s;
	}
	
	public void loadImage(){
		try{
			img = ImageIO.read(new File("resources/MarioWorld.png"));
		}catch(Exception E){
			System.out.println("failed to load image");
		}
	}
	
	public void paintImage(Graphics g){
		g.drawImage(img, 0, 0, 640, 480, null);
	}

}
