import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    GreenfootSound MusicIntro = new GreenfootSound("IntroMusic.wav");
    
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MainText mainText = new MainText();
        addObject(mainText,300,221);
    }
    
    /** Goes to the game when the user presses 'enter'
     *  Also plays the clicking sound
     */
    public void act()
    {
        music();
        if (Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new Level1());
            Greenfoot.playSound("Click.wav");
        }
        
        if (Greenfoot.isKeyDown("i")){
            Greenfoot.setWorld(new InstructionMenu());
            Greenfoot.playSound("Click.wav");
        }   
    }
    
    /**
     * Plays and stops the intro music
     * 
     */
    public void music()
    {
        MusicIntro.play();
        MusicIntro.playLoop();
        
        if (Greenfoot.isKeyDown("enter") | Greenfoot.isKeyDown("i")){
            MusicIntro.stop();
        }   
        
    }
}
