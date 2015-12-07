/**
 * Game class is the main class of the game. It holds
 * all of the objects which make the game run
 * @author BlueBird
 *
 */

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Game extends Frame implements MouseListener, KeyListener {

	private Grace Grace;
	private Abutton newGameButton, endGameButton;
		
	public Game(){
		
		Grace = new Grace();
		
	}//Game

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = event.getX();
		int y = event.getY();
		
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
		int x = event.getX();
		int y = event.getY();
		
		if (newGameButton.isInside(x,y)){
			newGameButton.flip();
		}
		
		else if(endGameButton.isInside(x,y){
			endGamebutton.flip();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		int x = event.getX();
		int y = event.getY();
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
	
}//end Game
