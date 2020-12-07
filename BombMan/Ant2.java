import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ant2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ant2 extends Actor
{
    /**
     * Act - do whatever the Ant2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(9);
        turn(9);
        edge();
        eatPlayer();
    }
    
    /**
      * This method will remove the player if it is touching the fly object
      */
     private void eatPlayer() { 
      if(isTouching(Player.class)) {
           removeTouching(Player.class);
           Greenfoot.playSound("game-over.wav");
           Greenfoot.setWorld(new GameOverScreen());
      }
    }
      /**
    * This method is to make the Fly objects move nonstop
     */
      public void edge() {
    int x = getX();
    int y = getY();
    int worldWidth = getWorld().getWidth() - 1;
    int worldHeight = getWorld().getHeight() - 1;
    if (x >= worldWidth) {
     setLocation(1 , y);
     }
    if (x <= 0) {
     setLocation(worldWidth - 1 , y);
    }
     if ( y >= worldHeight){ 
     setLocation(x,1);
    }
    if (y <= 0) {
     setLocation(x , worldHeight - 1);
    }
    }  
    
    }    

