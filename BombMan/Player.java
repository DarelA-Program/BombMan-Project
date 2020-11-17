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
    
    public void checkKeyPressed(){
        if(Greenfoot.isKeyDown("up")) {
            //setRotation(Direction.UP);
            turn(-3);
    }
    if(Greenfoot.isKeyDown("down")) {
        //setRotation(Direction.DOWN);
        turn(3);
    }
    if(Greenfoot.isKeyDown("left")) {
        //setRotation(Direction.LEFT);
        move(-3);
    }
    if(Greenfoot.isKeyDown("right")) {
        //setRotation(Direction.RIGHT);
        move(3);
    }
}
}

    
     



    
        
        
       
      






