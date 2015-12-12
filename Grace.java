import java.awt.image.BufferedImage;

public class Grace {
	
	private double x,y; //
	
	private int  width, height; // Grace's width and height
	
	private double gravity,speedV,speedH;
	
	private double weight; // Grace's weight that will make her come back down after jumping
	
	private boolean moveLeft, moveRight, jump = false; // Booleans for Grace's movements
	
	public void moveLeft(){
		moveLeft = true;
	}
	
	public void moveRight(){
		moveRight = false;
	}
	
	public void jump() {
		jump = false;
	}
	
	public void setHorizontalSpeed(double sH ){
		
	}
	
	public void drawGrace(){
		
	}
}
