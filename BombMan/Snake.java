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
     * All the methods are called here
     */
  public void act() 
  {
      moveSnake();
      eatPlayer();
  }
   /**
    * This method makes the snake move randomly
     * As soon as the game starts the snake will move randomly
    */
  private void moveSnake()
  {
    if (Greenfoot.getRandomNumber(200) < 10) {
           turn (Greenfoot.getRandomNumber(30));
   } 
    move(2);
   if (isAtEdge()) {
    turn (4);
   }
    }
  /**
   * This method is to when the snake eats the player
   */
  private void eatPlayer()
  {
     if(isTouching(Player.class)) {
           removeTouching(Player.class);
           Greenfoot.stop();
   }
    }
}

