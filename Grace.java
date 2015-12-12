import java.awt.image.BufferedImage;

public class Grace {
	
	private double x,y; //
	
	private int  width, height; // Grace's width and height
	
	private double gravity,speedV,speedH; //
	
	private double weight; // Grace's weight that will make her come back down after jumping
	
	private boolean moveLeft, moveRight, jumping = false; // Booleans for Grace's movements
	
	private Terrain[] t;
	
	public void moveLeft(){
		moveLeft = true;
	}// moveRLeft
	
	public void moveRight(){
		moveRight = true;
	}// moveRight
	
	public void stopLeft(){
		moveLeft = false;
	}
	
	public void stopRight(){
		moveRight = false;
	}
	
	public void jump(Terrain[] t) {
		this.t = t;
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
			}
			else if(collide()){
				jumping = false;
			}
		}	
	}// jumpMotion
	
	private boolean collide(){
		for(int i = 0; t.length > i; i++){
			if (t[i] != null){
				int tX = t[i].getX();
				int tW = t[i].getWidth();
				int tY = t[i].getY();
				if(tX < (x + width) && (tX + tW) > x && tY == (y + height)){
					return true;
				}
			}
		}
		return false;
	}//collide
	
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
