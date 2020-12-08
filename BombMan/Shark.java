import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shark extends Actor
{
    public Shark()
    {
        GreenfootImage img = getImage();
        img.mirrorHorizontally();
    }
    
    /**
     * Act - do whatever the Shark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-5, getY());
        eatPlayer();

        if (getX() == 0) 
        {
            Level3 level3 = (Level3)getWorld();

            level3.removeObject(this);
        } 
    } 
    
      /**
   * This method is to when the shark eats the player
   */
  private void eatPlayer()
  {
     if(isTouching(Player.class)) {
           removeTouching(Player.class);
           Greenfoot.setWorld(new GameOverScreen());
           Greenfoot.playSound("game-over.wav");
   }
  }
}