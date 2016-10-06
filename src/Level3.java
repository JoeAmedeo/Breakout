import java.util.ArrayList;


public class Level3{
	
	public ArrayList<Brick> _BrickList = new ArrayList<Brick>();
	public Level3(){
		
		int[] color1 = new int[4];
		color1[0] = 200;
		color1[1] = 0;
		color1[2] = 0;
		color1[3] = 200;
		_BrickList.add(new Brick(0, 280, 79, 79, color1, 3));
		_BrickList.add(new Brick(80, 280, 79, 79, color1, 3));
		_BrickList.add(new Brick(160, 280, 79, 79, color1, 3));
		_BrickList.add(new Brick(240, 280, 79, 79, color1, 3));
		_BrickList.add(new Brick(320, 280, 79, 79, color1, 3));
		_BrickList.add(new Brick(400, 280, 79, 79, color1, 3));
		_BrickList.add(new Brick(480, 280, 79, 79, color1, 3));
		_BrickList.add(new Brick(560, 280, 79, 79, color1, 3));
		
		int[] color2 = new int[4];
		color2[0] = 0;
		color2[1] = 200;
		color2[2] = 0;
		color2[3] = 200;
		
		_BrickList.add(new Brick(0, 200, 79, 79, color2, 4));
		_BrickList.add(new Brick(80, 200, 79, 79, color2, 4));
		_BrickList.add(new Brick(160, 200, 79, 79, color2, 4));
		_BrickList.add(new Brick(240, 200, 79, 79, color2, 4));
		_BrickList.add(new Brick(320, 200, 79, 79, color2, 4));
		_BrickList.add(new Brick(400, 200, 79, 79, color2, 4));
		_BrickList.add(new Brick(480, 200, 79, 79, color2, 4));
		_BrickList.add(new Brick(560, 200, 79, 79, color2, 4));
		
		int[] color3 = new int[4];
		color3[0] = 0;
		color3[1] = 0;
		color3[2] = 200;
		color3[3] = 200;
		
		_BrickList.add(new Brick(0, 120, 79, 79, color3, 5));
		_BrickList.add(new Brick(80, 120, 79, 79, color3, 5));
		_BrickList.add(new Brick(160, 120, 79, 79, color3, 5));
		_BrickList.add(new Brick(240, 120, 79, 79, color3, 5));
		_BrickList.add(new Brick(320, 120, 79, 79, color3, 5));
		_BrickList.add(new Brick(400, 120, 79, 79, color3, 5));
		_BrickList.add(new Brick(480, 120, 79, 79, color3, 5));
		_BrickList.add(new Brick(560, 120, 79, 79, color3, 5));
	}

}
