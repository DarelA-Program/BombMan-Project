import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Confirmation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Confirmation extends MainWorld
{

    /**
     * When the user presses 'y' it will set the world to level 3
     * 
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("y")){
            Greenfoot.setWorld(new Level3());
            Greenfoot.playSound("Click.wav");
        }
    }
}
