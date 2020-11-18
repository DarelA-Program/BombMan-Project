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
        checkKeyPressed();
        collectingCoins();
   }
  
    

    /**
     * This method is made for the character to move left, right, up, down;
     */
    
    private void checkKeyPressed(){
    if(Greenfoot.isKeyDown("up")) {
       setLocation(getX(), getY() - 7);
    }
    if(Greenfoot.isKeyDown("down")) {
       setLocation(getX(), getY() + 7); 
    }
    if(Greenfoot.isKeyDown("left")) {
       setLocation(getX() - 7, getY()); 
    }
    if(Greenfoot.isKeyDown("right")) {
       setLocation(getX() + 7, getY()); 
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
    }

    
     



    
        
        
       
      






