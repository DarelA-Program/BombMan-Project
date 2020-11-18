import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Player here.
 * @author (your name) @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * this method is called when the Player touches the coin the coin will disapear
     */
   public void act() {
        checkKeyPressed();
        if (isTouching(Coin.class)) {
          removeTouching(Coin.class);
        }
   }
  
    

    /**
     * This method is made for the character to move left, right, up, down;
     */
    
    private void checkKeyPressed(){
    if(Greenfoot.isKeyDown("up")) {
       setLocation(getX(), getY() - 5);
    }
    if(Greenfoot.isKeyDown("down")) {
       setLocation(getX(), getY() + 5); 
    }
    if(Greenfoot.isKeyDown("left")) {
       setLocation(getX() - 5, getY()); 
    }
    if(Greenfoot.isKeyDown("right")) {
       setLocation(getX() + 5, getY()); 
    }
}
}

    
     



    
        
        
       
      






