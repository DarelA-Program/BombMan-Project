import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fly extends Enemies
{
    /**
     * Act - do whatever the Fly wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.  */
    public void act() 
    {
        move(9);
        edge();
        eatPlayer();
    }    
    
     /**
      * This method will remove the player if it is touching the fly object
      */
     private void eatPlayer() { 
      if(isTouching(Player.class)) {
           removeTouching(Player.class);
        }
    }
}

