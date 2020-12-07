import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends MainWorld
{

    /**
     * Constructor for objects of class GameOverScreen.
     * 
     */
    public GameOverScreen()
    {
    }
    
     /** Goes to the Main Menu when the user presses 'enter'
     *  Also plays the clicking sound
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MainMenu());
            Greenfoot.playSound("Click.wav");
        } 
    }
}
