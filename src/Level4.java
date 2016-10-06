import java.util.ArrayList;



public class Level4 {
	public ArrayList<Brick> _BrickList = new ArrayList<>();
	public Level4(){
		
		//add all red bricks
		int[] color = new int[4];
		color[0] = 250;
		color[1] = 0;
		color[2] = 0;
		color[3] = 250;
		
		//top row
		_BrickList.add(new Brick(245, 0, 24, 24, color));
		_BrickList.add(new Brick(270, 0, 24, 24, color));
		_BrickList.add(new Brick(295, 0, 24, 24, color));
		_BrickList.add(new Brick(320, 0, 24, 24, color));
		_BrickList.add(new Brick(345, 0, 24, 24, color));
		
		//second row
		_BrickList.add(new Brick(220, 25, 24, 24, color));
		_BrickList.add(new Brick(245, 25, 24, 24, color));
		_BrickList.add(new Brick(270, 25, 24, 24, color));
		_BrickList.add(new Brick(295, 25, 24, 24, color));
		_BrickList.add(new Brick(320, 25, 24, 24, color));
		_BrickList.add(new Brick(345, 25, 24, 24, color));
		_BrickList.add(new Brick(370, 25, 24, 24, color));
		_BrickList.add(new Brick(395, 25, 24, 24, color));
		_BrickList.add(new Brick(420, 25, 24, 24, color));
		
		//8th row
		_BrickList.add(new Brick(270, 175, 24, 24, color));
		
		//9th row
		_BrickList.add(new Brick(270, 200, 24, 24, color));
		_BrickList.add(new Brick(345, 200, 24, 24, color));
		
		//10th row
		_BrickList.add(new Brick(270, 225, 24, 24, color));
		_BrickList.add(new Brick(345, 225, 24, 24, color));
		
		//11th row
		_BrickList.add(new Brick(270, 250, 24, 24, color));
		_BrickList.add(new Brick(295, 250, 24, 24, color));
		_BrickList.add(new Brick(320, 250, 24, 24, color));
		_BrickList.add(new Brick(345, 250, 24, 24, color));
		
		//12th row
		_BrickList.add(new Brick(245, 275, 24, 24, color));
		_BrickList.add(new Brick(295, 275, 24, 24, color));
		_BrickList.add(new Brick(320, 275, 24, 24, color));
		_BrickList.add(new Brick(370, 275, 24, 24, color));
		
		//13th row
		_BrickList.add(new Brick(220, 300, 24, 24, color));
		_BrickList.add(new Brick(245, 300, 24, 24, color));
		_BrickList.add(new Brick(270, 300, 24, 24, color));
		_BrickList.add(new Brick(295, 300, 24, 24, color));
		_BrickList.add(new Brick(320, 300, 24, 24, color));
		_BrickList.add(new Brick(345, 300, 24, 24, color));
		_BrickList.add(new Brick(370, 300, 24, 24, color));
		_BrickList.add(new Brick(395, 300, 24, 24, color));
		
		//14th row
		_BrickList.add(new Brick(220, 325, 24, 24, color));
		_BrickList.add(new Brick(245, 325, 24, 24, color));
		_BrickList.add(new Brick(270, 325, 24, 24, color));
		_BrickList.add(new Brick(345, 325, 24, 24, color));
		_BrickList.add(new Brick(370, 325, 24, 24, color));
		_BrickList.add(new Brick(395, 325, 24, 24, color));
		
		//skin color bricks
		color[0] = 240;
		color[1] = 214;
		color[2] = 188;
		
		//3rd row
		_BrickList.add(new Brick(295, 50, 24, 24, color));
		_BrickList.add(new Brick(320, 50, 24, 24, color));
		_BrickList.add(new Brick(370, 50, 24, 24, color));
		
		//4th row
		_BrickList.add(new Brick(220, 75, 24, 24, color));
		_BrickList.add(new Brick(270, 75, 24, 24, color));
		_BrickList.add(new Brick(295, 75, 24, 24, color));
		_BrickList.add(new Brick(320, 75, 24, 24, color));
		_BrickList.add(new Brick(370, 75, 24, 24, color));
		_BrickList.add(new Brick(395, 75, 24, 24, color));
		_BrickList.add(new Brick(420, 75, 24, 24, color));
		
		//5th row
		_BrickList.add(new Brick(220, 100, 24, 24, color));
		_BrickList.add(new Brick(295, 100, 24, 24, color));
		_BrickList.add(new Brick(320, 100, 24, 24, color));
		_BrickList.add(new Brick(345, 100, 24, 24, color));
		_BrickList.add(new Brick(395, 100, 24, 24, color));
		_BrickList.add(new Brick(420, 100, 24, 24, color));
		_BrickList.add(new Brick(445, 100, 24, 24, color));
		
		
		//6th row
		_BrickList.add(new Brick(245, 125, 24, 24, color));
		_BrickList.add(new Brick(270, 125, 24, 24, color));
		_BrickList.add(new Brick(295, 125, 24, 24, color));
		_BrickList.add(new Brick(320, 125, 24, 24, color));
		
		//7th row
		_BrickList.add(new Brick(245, 150, 24, 24, color));
		_BrickList.add(new Brick(270, 150, 24, 24, color));
		_BrickList.add(new Brick(295, 150, 24, 24, color));
		_BrickList.add(new Brick(320, 150, 24, 24, color));
		_BrickList.add(new Brick(345, 150, 24, 24, color));
		_BrickList.add(new Brick(370, 150, 24, 24, color));
		_BrickList.add(new Brick(395, 150, 24, 24, color));
		
		//11th row
		_BrickList.add(new Brick(170, 250, 24, 24, color));
		_BrickList.add(new Brick(195, 250, 24, 24, color));
		_BrickList.add(new Brick(420, 250, 24, 24, color));
		_BrickList.add(new Brick(445, 250, 24, 24, color));
		
		//12th row
		_BrickList.add(new Brick(170, 275, 24, 24, color));
		_BrickList.add(new Brick(195, 275, 24, 24, color));
		_BrickList.add(new Brick(220, 275, 24, 24, color));
		_BrickList.add(new Brick(395, 275, 24, 24, color));
		_BrickList.add(new Brick(420, 275, 24, 24, color));
		_BrickList.add(new Brick(445, 275, 24, 24, color));
		
		//13th row
		_BrickList.add(new Brick(170, 300, 24, 24, color));
		_BrickList.add(new Brick(195, 300, 24, 24, color));
		_BrickList.add(new Brick(420, 300, 24, 24, color));
		_BrickList.add(new Brick(445, 300, 24, 24, color));
		
		//dark brown bricks, hair
		color[0] = 60;
		color[1] = 45;
		color[2] = 40;
		
		//3rd row
		_BrickList.add(new Brick(220, 50, 24, 24, color));
		_BrickList.add(new Brick(245, 50, 24, 24, color));
		_BrickList.add(new Brick(270, 50, 24, 24, color));
		
		//4th row
		_BrickList.add(new Brick(195, 75, 24, 24, color));
		_BrickList.add(new Brick(245, 75, 24, 24, color));
		
		//5th row
		_BrickList.add(new Brick(195, 100, 24, 24, color));
		_BrickList.add(new Brick(245, 100, 24, 24, color));
		_BrickList.add(new Brick(270, 100, 24, 24, color));
		_BrickList.add(new Brick(370, 100, 24, 24, color));
		
		//6th row
		_BrickList.add(new Brick(195, 125, 24, 24, color));
		_BrickList.add(new Brick(220, 125, 24, 24, color));
		_BrickList.add(new Brick(345, 125, 24, 24, color));
		_BrickList.add(new Brick(370, 125, 24, 24, color));
		_BrickList.add(new Brick(395, 125, 24, 24, color));
		_BrickList.add(new Brick(420, 125, 24, 24, color));
		
		//light brown bricks, shoes
		color[0] = 100;
		color[1] = 75;
		color[2] = 62;
		
		//15th row
		_BrickList.add(new Brick(195, 350, 24, 24, color));
		_BrickList.add(new Brick(220, 350, 24, 24, color));
		_BrickList.add(new Brick(245, 350, 24, 24, color));
		_BrickList.add(new Brick(370, 350, 24, 24, color));
		_BrickList.add(new Brick(395, 350, 24, 24, color));
		_BrickList.add(new Brick(420, 350, 24, 24, color));
		
		//16th row
		_BrickList.add(new Brick(170, 375, 24, 24, color));
		_BrickList.add(new Brick(195, 375, 24, 24, color));
		_BrickList.add(new Brick(220, 375, 24, 24, color));
		_BrickList.add(new Brick(245, 375, 24, 24, color));
		_BrickList.add(new Brick(370, 375, 24, 24, color));
		_BrickList.add(new Brick(395, 375, 24, 24, color));
		_BrickList.add(new Brick(420, 375, 24, 24, color));
		_BrickList.add(new Brick(445, 375, 24, 24, color));
		
		//black bricks, eyes
		
		color[0] = 0;
		color[1] = 0;
		color[2] = 0;
		
		//3rd row
		_BrickList.add(new Brick(345, 50, 24, 24, color));
		
		//4th row
		_BrickList.add(new Brick(345, 75, 24, 24, color));
		
		//yellow bricks, buttons
		color[0] = 250;
		color[1] = 250;
		color[2] = 0;
		
		//12th row
		Brick brick = new Brick(270, 275, 24, 24, color);
		brick.setCreatesBall(true);
		_BrickList.add(brick);
		brick = new Brick(345, 275, 24, 24, color);
		brick.setCreatesBall(true);
		_BrickList.add(brick);
		
		//blue bricks, pants
		color[0] = 0;
		color[1] = 0;
		color[2] = 250;
		
		//8th row
		_BrickList.add(new Brick(220, 175, 24, 24, color));
		_BrickList.add(new Brick(245, 175, 24, 24, color));
		_BrickList.add(new Brick(295, 175, 24, 24, color));
		_BrickList.add(new Brick(320, 175, 24, 24, color));
		_BrickList.add(new Brick(345, 175, 24, 24, color));
		
		//9th row
		_BrickList.add(new Brick(195, 200, 24, 24, color));
		_BrickList.add(new Brick(220, 200, 24, 24, color));
		_BrickList.add(new Brick(245, 200, 24, 24, color));
		_BrickList.add(new Brick(295, 200, 24, 24, color));
		_BrickList.add(new Brick(320, 200, 24, 24, color));
		_BrickList.add(new Brick(370, 200, 24, 24, color));
		_BrickList.add(new Brick(395, 200, 24, 24, color));
		_BrickList.add(new Brick(420, 200, 24, 24, color));
		
		//10th row
		_BrickList.add(new Brick(170, 225, 24, 24, color));
		_BrickList.add(new Brick(195, 225, 24, 24, color));
		_BrickList.add(new Brick(220, 225, 24, 24, color));
		_BrickList.add(new Brick(245, 225, 24, 24, color));
		_BrickList.add(new Brick(295, 225, 24, 24, color));
		_BrickList.add(new Brick(320, 225, 24, 24, color));
		_BrickList.add(new Brick(370, 225, 24, 24, color));
		_BrickList.add(new Brick(395, 225, 24, 24, color));
		_BrickList.add(new Brick(420, 225, 24, 24, color));
		_BrickList.add(new Brick(445, 225, 24, 24, color));
		
		//11th row
		_BrickList.add(new Brick(220, 250, 24, 24, color));
		_BrickList.add(new Brick(245, 250, 24, 24, color));
		_BrickList.add(new Brick(370, 250, 24, 24, color));
		_BrickList.add(new Brick(395, 250, 24, 24, color));
		
		
		
	}
}
