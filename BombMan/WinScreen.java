import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends MainWorld
{
    int RedCoinCount = 23;
    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen()
    {
        prepare();
        showText();
        displayText();
    }
    
     /**
     * When the user presses 'enter' it will bring them to the main menu
     * 
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MainMenu());
            Greenfoot.playSound("Click.wav");
        }
    }

    /**
     * Displays the amount of red coins collected
     * 
     */
    public void showText() { 
        showText("You Win! RedCoins collect" + " " + RedCoinCount, 366, 210);
    }
    
        /**
     * Displays a text to go back to the main menu
     * 
     */
    public void displayText() { 
        showText("Press 'enter' to go back.", 355, 250);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ScoreBoard scoreBoard = new ScoreBoard();
        addObject(scoreBoard,354,219);
    }
}
