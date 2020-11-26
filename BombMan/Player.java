import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Player here.
 * @author (your name) @version (a version number or a date)
 */
public class Player extends Move
{
    private int coinsCount = 0;
    /**
     * this method is called when the Player touches the coin the coin will disapear
     */
  public void act() {      
        collectingCoins();
        slide();
   }
  /**
   * This method is made for the goal of this game, each time the player
   * collects coins.
   */
    private void collectingCoins(){
    if (isTouching(Coin.class)) {
          removeTouching(Coin.class);
          coinsCount = coinsCount + 1;
          Greenfoot.playSound("135936__bradwesson__collectcoin.wav");
          getWorld().showText("Coins Collected:" + coinsCount, 600, 50);
        }
    if (coinsCount == 48) {
            Greenfoot.stop();
            getWorld().showText("WINNER COINS COLLECTED:" + coinsCount, 300, 300);
        }
    }
}





    
     



    
        
        
       
      






