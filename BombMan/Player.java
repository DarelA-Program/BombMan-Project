import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Player here.
 * @author (your name) @version (a version number or a date)
 */
public class Player extends Actor
{
    private int coinsCount = 0;
    /**
     * this method is called when the Player touches the coin the coin will disapear
     */
   public void act() {      
        collectingCoins();
        moveAround();
   }
   
   /**
     * This method is made for the character to move left, right, up, down;
     */
    
    public void moveAround(){
        int x = getX();
        int y = getY();
      
    if(Greenfoot.isKeyDown("up")) {
       setLocation(x, y - 6);
       setRotation(90);
       if (hitWalls() == true)
       setLocation(x,y + 6);
}

    if(Greenfoot.isKeyDown("down")) {
     setLocation(x, y + 6);
       setRotation(270);
     if (hitWalls() == true)
       setLocation(x,y + 6); 
}
 
   if(Greenfoot.isKeyDown("left")) {
       setLocation(x - 6, y);
       setRotation(0);
       if (hitWalls() == true)
       setLocation(x,y + 6);
}
 
 if(Greenfoot.isKeyDown("right")) {
     setLocation(x + 6, y);
     setRotation(0);
     if (hitWalls() == true)
       setLocation(x,y + 6);    
}
}

    

  /**
   * This method is made for the goal of this game, each time the player
   * collects coins.
   */
    private void collectingCoins(){
    if (isTouching(Coin.class)) {
          removeTouching(Coin.class);
          coinsCount = coinsCount + 1;
          getWorld().showText("Coins Collected:" + coinsCount, 580, 580);
        }
    if (coinsCount == 48) {
            Greenfoot.stop();
            getWorld().showText("WINNER COINS COLLECTED:" + coinsCount, 300, 300);
        }
    }
    public boolean hitWalls() {
        if (isTouching(Wall.class))
        {
        return true;
        }
    else
        {
        return false;
        }
    }
}





    
     



    
        
        
       
      






