import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JPanel;


public class Ball {
	private int _x;
	private int _y;
	private int _ballSize;
	private int xVelocity;
	private int yVelocity;
	private Color _ballColor;
	private final int _WIDTH;
	private final int _HEIGHT;
	
	public Clip sound = loadClip("/click_x.wav");
	
	public Ball(int x, int y, Color color, JPanel j){
		_x = x;
		_y = y;
		_WIDTH = j.getWidth();
		_HEIGHT = j.getHeight();
		xVelocity = 0; //make ball move straight down at the start of the game
		yVelocity = 3;
		_ballColor = color; //make ball the given color
		_ballSize = 20; //make ball size 20
	}
	
	public boolean move(){
		_x += xVelocity;
		_y += yVelocity;
		if(_x < 0){ // switch ball direction if it hits left side
			xVelocity *= -1;
			
		}
		if(_y<0){ //switch ball direction if it hits top side
			yVelocity *= -1;
			
		}
		if(_y+_ballSize > _HEIGHT){ //end game if ball hits the bottom of the screen
			yVelocity *= -1;
			return false;
		}
		if(_x+_ballSize > _WIDTH){ //switch ball direction if it hits right side
			xVelocity *= -1;
			
		}
		return true;
	}
	
	public void paint(Graphics g){
		Graphics2D graphic = (Graphics2D)g;
		graphic.setColor(_ballColor);
		graphic.fillOval(_x, _y, _ballSize, _ballSize);
	}
	public Rectangle getBounds(){
		return new Rectangle(_x, _y, _ballSize, _ballSize);
	}
	
	public void yCollision(){
		yVelocity *= -1; // if the ball collides with the Brick, reverse the y velocity
		playSound(sound);
	}
	
	public void xCollision(){
		xVelocity *= -1;
		playSound(sound);
	}
	
	public void PaddleCollision(Paddle p){
		yVelocity *= -1; // if the ball collides with the paddle, reverse the y velocity
		if(p.getLeft()){ //if the ball collides with the paddle and it is moving, change the x velocity
			xVelocity--;
		}
		if(p.getRight()){
			xVelocity++;
		}
		playSound(sound);
	}
	
	public int getY(){
		return _y;
	}
	public int getX(){
		return _x;
	}
	public int getSize(){
		return _ballSize;
	}
	
	public Clip loadClip(String s){
		Clip clip = null;
		try{
			AudioInputStream input = AudioSystem.getAudioInputStream(getClass().getResource(s));
			clip = AudioSystem.getClip();
			clip.open(input);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return clip;
	}
	
	public void playSound(Clip c){
		stopSound(c);
		c.start();
		
	}
	public void stopSound(Clip c){
		if(c.isRunning()){
			c.stop();
		}
		c.setFramePosition(0);
	}
	
}
