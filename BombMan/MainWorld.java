import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainWorld extends World
{
    SimpleTimer timer = new SimpleTimer();
    Counter countDown = new Counter();
    int start = 0;
    /**
     * Constructor for objects of class MainWorld.
     * 
     */
    public MainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
        addObject(countDown, 676, 15);
        countDown.setValue(300);
        
    }
    
    public void act()
    {
       if (start == 1)
       {
           if (timer.millisElapsed() > 1000)
           {
               countDown.add(-1);
               timer.mark();
           }
           
           if (countDown.getValue() == 0)
           {
               Greenfoot.stop();
               Greenfoot.setWorld(new GameOverScreen());
           }
       }  
       
       if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("right"))
       {
          start = 1; 
       }  
    }
   
}
