import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    /**
     * This method makes the snake move randomly
     * As soon as the game starts the snake will move randomly
     */
  public void act() 
  {
   if (Greenfoot.getRandomNumber(200) < 10) {
           turn (Greenfoot.getRandomNumber(30));
   } 
    move(2);
   if(isTouching(Player.class)) {
           removeTouching(Player.class);
   }
   if (isAtEdge()) {
    turn (4);
   }
  }
}

