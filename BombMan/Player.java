

import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Player here.
 * @author (your name) @version (a version number or a date)
 */
public class Player extends Move
{
    private int coinsCount = 0;
    private int flowerCount = 0;
    /**
     * this method is called when the Player touches the coin the coin will disapear
     */
  public void act() {      
        collectingCoins();
        collectingFlowers();
        slide();
        
     if(Greenfoot.isKeyDown("right")) {
	  setRotation(0);
	  move(4);
     }
     if(Greenfoot.isKeyDown("left")) {
	  setRotation(180);
	  move(4);
     }
     if(Greenfoot.isKeyDown("up")) {
	  setRotation(270);
	  move(4);
     }
     if(Greenfoot.isKeyDown("down")) {
	  setRotation(90);
	  move(4);
     }
  }
  
  /**
   * This method is made for the first level of this game, each time the player
   * collects coins.
   */
    private void collectingCoins(){
    if (isTouching(Coin.class)) {
          removeTouching(Coin.class);
          coinsCount = coinsCount + 1;
          Greenfoot.playSound("135936__bradwesson__collectcoin.wav");
          getWorld().showText("Coins Collected:" + coinsCount, 600, 50);
        }
    if (coinsCount == 16) {
            Greenfoot.stop();
            getWorld().showText("On To The Next Mission:" + coinsCount, 400, 300);
    }
  }
   /**
   * This method is made for the second level of this game, each time the player
   * collects flowers.
   */
   private void collectingFlowers() {
   if (isTouching(flower.class)) {
          removeTouching(flower.class);
          flowerCount = flowerCount + 1;
          Greenfoot.playSound("135936__bradwesson__collectcoin.wav");
          getWorld().showText("Flowers Collected:" + flowerCount, 600, 50);
        }
   if (flowerCount == 13) {
            Greenfoot.stop();
            getWorld().showText("On To The Last Mission:" + flowerCount, 400, 300);
    }
    
    }
}





    
     



    
        
        
       
      






