import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class WinScreen extends JPanel implements ActionListener {
	
	private String _name = "breakout";
	private Container _container;
	private JFrame _winScreen;
	private JButton _button;
	private int _score;
	private boolean _winStatus;
	
	public WinScreen(int score, boolean winStatus){
		_score = score;
		_winStatus = winStatus;
		_winScreen = new JFrame(_name);
		Button _newButton = new Button("Continue", 100, 50, 270, 300 );
		_button = _newButton.getButton();
		_button.addActionListener(this);
		this.setLayout(null);
		this.add(_button);
		_container = _winScreen.getContentPane();
		_container.add(this);
		this.setPreferredSize(new Dimension(640, 480));
		_winScreen.pack();
		_winScreen.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object a = e.getSource();
		if(a == _button){
			new StartingScreen();
			_winScreen.dispose();
		}
		
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		if(_winStatus == true){
			g.setFont(new Font("Congratulations! You won with a score of: " + _score, 20, 20));
			g.setColor(Color.red);
			g.drawString("Congratulations! You won with a score of: " + _score, 100, 100);
		}else{
			g.setFont(new Font("Game Over", 30, 30));
			g.setColor(Color.red);
			g.drawString("Game Over", 250, 100);
		}
		
	}

}
