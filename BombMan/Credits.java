import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends World
{

    /**
     * Constructor for objects of class Credits.
     * 
     */
    public Credits()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
    }
    
     /** Goes back to the main menu when the user presses 'enter'
     * 
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MainMenu());
            Greenfoot.playSound("Click.wav");
        }
    }
}
