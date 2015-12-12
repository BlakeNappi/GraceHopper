/**
 * Game class is the main class of the game. It holds
 * all of the objects which make the game run
 * @author BlueBird
 *
 */

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Game extends Frame implements MouseListener, KeyListener {

	private Grace Grace;
	private Abutton newGameButton, endGameButton;
	private int score;
	private GrassHopper[] grasshoppers;
	private Terrain[] terrain;
	private boolean playing;
	
	public Game(){
		
		Grace = new Grace();
		
		grasshoppers = new GrassHopper[25];
		terrain = new Terrain[100];
		
		score = 0;
		playing = true;
		
	}//Game
	
	/**
	*  This method checks the collison between the grasshoppers and Grace.
	**/
	private void grasshopperDown(){
		int temp;
		
		for (int row = 0; row < grasshoppers.length; row++){
			
			if (grasshoppers[row].isHit(Grace) == true){
				temp = row;
				grasshoppers[row] = null;
			}
		}
	}
	//end grasshopperDown()
	
	//paints everything
	public void paint(Graphics Pane){
		
		for(int i = 0; i < grasshoppers.length; i++){
			if(grasshoppers[i] != null){
				grasshoppers[i].paint(Pane);	//painting grasshoppers
			}
		}
		
		Grace.paint(Pane);
		
		endGameButton.paint(Pane);
		newGameButton.paint(Pane);
		
	}//paint
	
	private void getScore (int n){
		score = score + grasshoppers[n].getScore();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(playing){
			if(e.getKeyChar() == 'd' || e.getKeyChar() == 'D'){
				Grace.moveRight();
			}
			if(e.getKeyChar() == 'a' || e.getKeyChar() == 'A'){
				Grace.moveLeft();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar() == 'd' || e.getKeyChar() == 'D')
			Grace.stopRight();
		if(e.getKeyChar() == 'a' || e.getKeyChar() == 'A')
			Grace.stopLeft();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar() == KeyEvent.VK_SPACE && !Grace.getJump()){
			Grace.jump(terrain);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		
		if(newGameButton.isInside(x,y){
		score = 0;// resets the score
		repaint();//repaint the frame
		}
		else if (endGameButton.isInside(x,y){	
			System.exit(0);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		
		if (newGameButton.isInside(x,y)){
			newGameButton.flip();
		}
		
		else if(endGameButton.isInside(x,y){
			endGameButton.flip();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		int x = e.getX();
		int y = e.getY();
		JFrame frame = new JFrame("");
		
		if(newGameButton.isInside((x,y)){
			newGameButton.flip();
			score = 0;
			repaint();
		}
		
		else if (endGameButton.isInside(x,y))){
			endGameButton.flip();
			repaint();
			
		}
		
	}
	public void main(String[] args) {
		
	}
}//end Game
