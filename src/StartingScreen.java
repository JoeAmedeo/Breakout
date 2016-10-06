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


public class StartingScreen extends JPanel implements ActionListener {
	
	private String _name = "breakout";
	private Container _container;
	private JFrame _titleScreen;
	private JButton _button;
	private JButton _button2;
	private JButton _button3;
	private JButton _button4;
	private JButton _button5;
	
	public StartingScreen(){
		_titleScreen = new JFrame(_name);
		Button _newButton = new Button("Level 1",100,50,0,0);
		_button = _newButton.getButton();
		_button.addActionListener(this);
		_newButton = new Button("Level 2", 100, 50, 100, 0);
		_button2 = _newButton.getButton();
		_button2.addActionListener(this);
		_newButton = new Button("Level 3", 100, 50, 200, 0);
		_button3 = _newButton.getButton();
		_button3.addActionListener(this);
		_newButton = new Button("Level 4", 100, 50, 300, 0);
		_button4 = _newButton.getButton();
		_button4.addActionListener(this);
		_newButton = new Button("level5", 100, 50, 400, 0);
		_button5 = _newButton.getButton();
		_button5.addActionListener(this);
		_container = _titleScreen.getContentPane();
		this.setLayout(null);
		this.add(_button);
		this.add(_button2);
		this.add(_button3);
		this.add(_button4);
		this.add(_button5);
		_container.add(this);
		this.setPreferredSize(new Dimension(640, 480));
		_titleScreen.pack();
		_titleScreen.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object a = e.getSource();
		if(a == _button){
			TestLevel _level1 = new TestLevel();
			new GameScreen(_level1._BrickList);
			_titleScreen.dispose();
		}
		if(a == _button2){
			Level2 _level2 = new Level2();
			new GameScreen(_level2._BrickList);
			_titleScreen.dispose();
		}
		if(a == _button3){
			Level3 _level3 = new Level3();
			new GameScreen(_level3._BrickList);
			_titleScreen.dispose();
		}
		if(a == _button4){
			Level4 _level4 = new Level4();
			new GameScreen(_level4._BrickList);
			_titleScreen.dispose();
		}
		if(a == _button5){
			Level5 _level5 = new Level5();
			new GameScreen(_level5._BrickList);
			_titleScreen.dispose();
		}
		
	}
	
	//this function allows for writing words onto the screen
	@Override
	public void paintComponent(Graphics g){
		g.setFont(new Font(_name,30,30));
		g.setColor(Color.red);
		g.drawString(_name, 300, 300);
	}
	

}
