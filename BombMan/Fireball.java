import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Actor
{
    /**
     * Act - do whatever the Fireball wants to do. This method is called whenever
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
    
    public Fireball()
    {
        GreenfootImage img = getImage();
        img.mirrorHorizontally();
    }
}
