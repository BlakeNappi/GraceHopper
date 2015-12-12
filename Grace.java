import java.awt.image.BufferedImage;

public class Grace {
	
	private double x,y; //
	
	private int  width, height; // Grace's width and height
	
	private double gravity,speedV,speedH; //
	
	private double weight; // Grace's weight that will make her come back down after jumping
	
	private boolean moveLeft, moveRight, jumping = false; // Booleans for Grace's movements
	
	public void moveLeft(){
		moveLeft = true;
	}// moveRLeft
	
	public void moveRight(){
		moveRight = false;
	}// moveRight
	
	public void jump() {
		jumping = true;
		jumpMotion();
	}// jump
	
	private void jumpMotion(){
		int counter = 0;
		while(jumping){
			if(counter < 5){
				y+=speedV;
				counter++;
			}
			else if(counter == 5){
				y-=speedV;
			}else{
				jumping = false;
			}
		}	
	}// jumpMotion
	
	public boolean getJump(){
		return jumping;
	}// getJump
	
	public void moving(){
		while(true) {
			if(moveLeft && !moveRight) // Grace moves left
				x-=speedH;
			if(!moveLeft && moveRight) // Grace moves right
				x+=speedH;
		}// while loop
	}// moving
	
	public void setHorizontalSpeed(double sH ){
		
	}// setHorizontalSpeed
	
	public void drawGrace(){
		
	}// drawGrace
}// End Grace
