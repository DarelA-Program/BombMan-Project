import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends MainWorld
{
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {
        prepare();
    }
 
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Snake snake = new Snake();
        addObject(snake,664,77);
        Snake snake2 = new Snake();
        addObject(snake2,672,284);
        Snake snake3 = new Snake();
        addObject(snake3,71,292);
        Snake snake4 = new Snake();
        addObject(snake4,292,318);
        Snake snake5 = new Snake();
        addObject(snake5,492,276);
        Snake snake6 = new Snake();
        addObject(snake6,426,93);
        Snake snake7 = new Snake();
        addObject(snake7,261,142);
        flower flower = new flower();
        addObject(flower,356,180);
        flower flower2 = new flower();
        addObject(flower2,448,169);
        flower flower3 = new flower();
        addObject(flower3,503,169);
        flower flower4 = new flower();
        addObject(flower4,588,163);
        flower flower5 = new flower();
        addObject(flower5,610,240);
        flower flower6 = new flower();
        addObject(flower6,372,244);
        flower flower7 = new flower();
        addObject(flower7,400,329);
        flower flower8 = new flower();
        addObject(flower8,592,336);
        flower flower9 = new flower();
        addObject(flower9,163,303);
        flower flower10 = new flower();
        addObject(flower10,219,217);
        flower flower11 = new flower();
        addObject(flower11,264,268);
        flower flower12 = new flower();
        addObject(flower12,554,92);
        flower flower13 = new flower();
        addObject(flower13,492,346);
        Player player = new Player();
        addObject(player,62,80);
        Fly fly = new Fly();
        addObject(fly,689,381);
        Fly fly2 = new Fly();
        addObject(fly2,690,202);
    }
}
