import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JPanel;


public class Paddle {
	private int _x = 320;
	private int _y = 450;
	private int _width = 50;
	private int _height = 10;
	private final int _WIDTH;
	private final int _HEIGHT;
	private boolean _left = false;
	private boolean _right = false;
	public Paddle(JPanel j){
		_WIDTH = j.getWidth();
		_HEIGHT = j.getWidth();
		_x = (_WIDTH/2) - 20;
	}
	public void move(ArrayList<Ball> b){
		if(_left){
			_x += 4;
		}else if(_right){
			_x -= 4;
		}
		for(int i = 0; i<b.size(); i++){
			if(getBound().intersects(b.get(i).getBounds())){
				if(b.get(i).getY() + b.get(i).getSize() - 4 < _y){
					b.get(i).PaddleCollision(this);
				}else{
					b.get(i).xCollision();
				}
			}
		}
		
	}
	public void paint(Graphics g){
		g.setColor(Color.black);
		g.fillRect(_x,  _y, _width, _height);
	}
	
	public void setRight(boolean b){
		_left = b;
	}
	public void setLeft(boolean b){
		_right = b;
	}
	
	public boolean getLeft(){
		return _left;
	}
	
	public boolean getRight(){
		return _right;
	}
	
	public Rectangle getBound(){
		return new Rectangle(_x, _y, _width, _height);
	}
	
	
}
