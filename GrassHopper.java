import java.util.awt*;

public class GrassHopper {
   
    protected int movement; // The movement for the grasshoppers
    
    protected int x, y; // X and Y coordinates for grasshopper positions
    
    protected int points; //
    
    protected int hops, //the current number of hops the grasshopper has done
               hopLim, //the limit of hops
               hopUp,   //distance the hops go up
               hopHor; // The distance the hops go horizontally
    
    protected boolean hopRight; //direction the grasshopper moves
    
    /**
     * This method will set up the movements for
     * each grasshopper
     * and set up a limit for them to stop moving
     **/
    public Grasshopper(){
      this.hops = 2;
      this.hopLim = 3;
    }//Grasshopper
    
    public int randomHopMovement() {
      
    if(hops == hopLim){
       hopRight = flase;
    }else if(hops == 0){
       hopRight = true;
    }
      
    }//randomHopMovement
    
    public int getPoints() {
    
        return points; // Return the points from the grasshoppers
       
    }//getPoints
    
} // End GrassHopper 
