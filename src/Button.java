import java.awt.Dimension;

import javax.swing.JButton;

/*
 * The button class is intended to be used to help create multiple buttons for a single screen.
 * Create an instance of type Button and call the function CreateButton to create a new button
 * 
 * 
 */


public class Button {
	private JButton _button;
	public Button(String s, int x, int y, int shift_x, int shift_y){
		_button = new JButton(s);
		_button.setPreferredSize(new Dimension(x,y));
		_button.setBounds(shift_x, shift_y, x,y);
	}
	public JButton getButton(){
		return _button;
	}

}
