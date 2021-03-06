import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionMenu extends World
{

    /**
     * Constructor for objects of class InstructionMenu.
     * 
     */
    public InstructionMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    /** Goes back to the main menu when the user presses 'b'
     * 
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("b")){
        Greenfoot.setWorld(new MainMenu());
        Greenfoot.playSound("Click.wav");
        }
    }
}
