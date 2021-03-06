

import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Player here.
 * @author (your name) @version (a version number or a date)
 */
public class Player extends Move
{
    private int coinsCount = 0;
    private int RedCoinCount = 0;
    private int counter = 0;
    private int flowerCount = 0;
    int level3Lives = 3;
    int level2Lives = 3;
    int level1Lives = 3;
    
    private GreenfootImage image1;
    private GreenfootImage image2;
    
     /**
     * Create a crab and initialize its two images.
     */
    public Player()
    {
        image1 = new GreenfootImage("jump.png");
        image2 = new GreenfootImage("duck.png");
        setImage(image1);
    }
    
    /**
     * this method is called when the Player touches the coin the coin will disapear
     */
  public void act() {      
        collectingCoins();
        collectingFlowers();
        collectingRedCoin();
        slide();
        level3Lives();
        level2Lives();
        level1Lives();
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
     
     if (counter == 5) {
         switchImage();
         counter = 0;
     }
     else {
         counter = counter + 1;
     }
     
  }
  
    /**
     * Live lost whenever they touch an enemy for level 3
     */
  public void level3Lives()
    {
     {
         if(isTouching(Shark.class)) {
           level3Lives--;
           setLocation(26,210);
           getWorld().showText("Lives" + level3Lives, 600, 100);
           if (level3Lives == 0) {
              removeTouching(Player.class);
              Greenfoot.setWorld(new GameOverScreen());
              Greenfoot.playSound("game-over.wav");  
           }
         }
         
         if(isTouching(Fireball.class)) {
           level3Lives--;
           setLocation(26,210);
           getWorld().showText("Lives" + level3Lives, 600, 100);
           if (level3Lives == 0) {
              removeTouching(Player.class);
              Greenfoot.setWorld(new GameOverScreen());
              Greenfoot.playSound("game-over.wav");  
           }
         }
     }
  }
  
  /**
     * Live lost whenever they touch an enemy for level 2
     */
  public void level2Lives()
    {
     {
         if(isTouching(Ant.class)) {
           level2Lives--;
           setLocation(26,210);
           getWorld().showText("Lives" + level2Lives, 600, 100);
           if (level2Lives == 0) {
              removeTouching(Player.class);
              Greenfoot.setWorld(new GameOverScreen());
              Greenfoot.playSound("game-over.wav");  
           }
         }
         
         if(isTouching(Ant2.class)) {
           level2Lives--;
           setLocation(26,210);
           getWorld().showText("Lives" + level2Lives, 600, 100);
           if (level2Lives == 0) {
              removeTouching(Player.class);
              Greenfoot.setWorld(new GameOverScreen());
              Greenfoot.playSound("game-over.wav");  
           }
         }
     }
  }
 
   /**
     * Live lost whenever they touch an enemy for level 1
     */
  public void level1Lives()
    {
     {
         if(isTouching(Snake.class)) {
           level1Lives--;
           setLocation(56,367);
           getWorld().showText("Lives" + level1Lives, 600, 100);
           if (level1Lives == 0) {
              removeTouching(Player.class);
              Greenfoot.setWorld(new GameOverScreen());
              Greenfoot.playSound("game-over.wav");  
           }
         }
         
         if(isTouching(Fly.class)) {
           level1Lives--;
           setLocation(56,367);
           getWorld().showText("Lives" + level1Lives, 600, 100);
           if (level1Lives == 0) {
              removeTouching(Player.class);
              Greenfoot.setWorld(new GameOverScreen());
              Greenfoot.playSound("game-over.wav");  
           }
         }
     }
  }
  
  /**
     * Animation by switching images
     */
    public void switchImage()
    {
        if (getImage() == image1) 
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
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
    if (coinsCount == 22) {
            Greenfoot.stop();
            getWorld().showText("On To The Next Mission:" + coinsCount, 400, 300);
            Greenfoot.setWorld(new Level2());
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
          Greenfoot.playSound("slurp.wav");
          getWorld().showText("Flowers Collected:" + flowerCount, 600, 50);
   }
   if (flowerCount == 12) {
            Greenfoot.stop();
            getWorld().showText("On To The Last Mission:" + flowerCount, 400, 300);
            Greenfoot.setWorld(new Confirmation());
   }
}


   
   /**
   * This method is made for the second level of this game, each time the player
   * collects redCoins.
   */
   private void collectingRedCoin() {
   if (isTouching(RedCoin.class)) {
          removeTouching(RedCoin.class);
          RedCoinCount = RedCoinCount + 1;
          Greenfoot.playSound("135936__bradwesson__collectcoin.wav");
          getWorld().showText("Red Coins Collected:" + RedCoinCount, 600, 50);
   }
      if (RedCoinCount == 23) {
            Greenfoot.stop();
            Greenfoot.setWorld(new WinScreen());
   }
  }
  
  
}





    
     



    
        
        
       
      






