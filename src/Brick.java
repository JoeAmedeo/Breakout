import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;


public class Brick {
	private int _x;
	private int _y;
	private int _width;
	private int _height;
	private int _hits = 1;
	private Color _color = Color.black;
	private int _colorR, _colorB, _colorG, _colorAlpha;
	private boolean _createsBall = false;
	
	public Brick(int x, int y, int width, int height){
		_x = x;
		_y = y;
		_width = width;
		_height = height;
	}
	
	public Brick(int x, int y, int width, int height, int[] color){
		_x = x;
		_y = y;
		_width = width;
		_height = height;
		_color = new Color(color[0], color[1], color[2]);
		_colorR = color[0];
		_colorB = color[1];
		_colorG = color[2];
		_colorAlpha = color[3];
		
	}
	
	public Brick(int x, int y, int width, int height, int[] color, int hits){
		_x = x;
		_y = y;
		_width = width;
		_height = height;
		_color = new Color(color[0], color[1], color[2]);
		_colorR = color[0];
		_colorB = color[1];
		_colorG = color[2];
		_colorAlpha = color[3];
		_hits = hits;
	}
	
	public void paint(Graphics g){
		g.setColor(_color);
		g.fillRect(_x,  _y, _width, _height);
	}
	
	public boolean checkCollision(ArrayList<Ball> b){
		for(int i = 0; i < b.size(); i++){
			if(getBound().intersects(b.get(i).getBounds())){
				if(b.get(i).getY() + b.get(i).getSize() - 4 < _y){
					b.get(i).yCollision();
				}else if(b.get(i).getY() > _y + _height - 4){
					b.get(i).yCollision();
				}else{
					b.get(i).xCollision();
				}
				return true;
			}
		}
		return false;
	}
	
	
	public Rectangle getBound(){
		return new Rectangle(_x, _y, _width, _height);
	}
	
	public void Hit(){
		_hits--;
		HitColorChange();
	}
	
	public int getHits(){
		return _hits;
	}
	
	private void HitColorChange(){
		_colorAlpha = _colorAlpha / 2;
		_color = new Color(_colorR, _colorB, _colorG, _colorAlpha);
	}
	
	public void setCreatesBall(boolean b){
		_createsBall = b;
	}
	
	public boolean getCreatesBall(){
		return _createsBall;
	}
	public int getX(){
		return _x;
	}
	public int getY(){
		return _y;
	}

}
