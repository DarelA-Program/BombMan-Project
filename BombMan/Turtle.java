import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Move
{
    private int coinsCount = 0;
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       slide();
       collectingCoins();
    }  
    
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
