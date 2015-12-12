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
		moveRight = false;
	}// moveRight
	
	public void jump(Terrain[] t) {
		terrain = t;
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
		for(int i = 0; terrain[i]; i++){
			if (terrain[i] != null){
				int tX = terrain[i].getX();
				int tW = terrain[i].getWidth();
				int tY = terrain[i].getY();
				if(tX < (x + width) && (tX + tW) > X && tY == (y + height)){
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
