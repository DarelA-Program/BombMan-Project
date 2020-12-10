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
     /**
     * Flips the shark image so it faces the user
     * 
     */
    {
        GreenfootImage img = getImage();
        
       {
            img.mirrorHorizontally();
       }
    }
    
    /**
     * Act - Calls the eatPlayer method and removes the shark when touching world
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-5, getY());

        if (getX() == 0) 
        {
            Level3 level3 = (Level3)getWorld();

            level3.removeObject(this);
        } 
    } 
    

}
