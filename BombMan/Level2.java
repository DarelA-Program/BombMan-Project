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

        Ant ant = new Ant();
        addObject(ant,3,45);
        Ant ant2 = new Ant();
        addObject(ant2,3,145);
        Ant ant3 = new Ant();
        addObject(ant3,3,245);
        Ant ant4 = new Ant();
        addObject(ant4,3,345);

        Ant2 ant52 = new Ant2();
        addObject(ant52,227,145);
        Ant2 ant62 = new Ant2();
        addObject(ant62,227,245);

        Ant2 ant82 = new Ant2();
        addObject(ant82,427,145);
        Ant2 ant92 = new Ant2();
        addObject(ant92,427,245);

        Ant2 ant212 = new Ant2();
        addObject(ant212,627,145);
        Ant2 ant222 = new Ant2();
        addObject(ant222,627,245);

        Player player = new Player();
        addObject(player,67,80);

        flower flower = new flower();
        addObject(flower,226,74);
        flower flower1 = new flower();
        addObject(flower1,426,74);
        flower flower2 = new flower();
        addObject(flower2,626,74);
        flower flower3 = new flower();
        addObject(flower3,226,174);
        flower flower21 = new flower();
        addObject(flower21,426,174);
        flower flower22 = new flower();
        addObject(flower22,426,274);
        flower flowe3r = new flower();
        addObject(flowe3r,426,374);
        flower flower4 = new flower();
        addObject(flower4,226,274);
        flower flower5 = new flower();
        addObject(flower5,226,374);
        flower floweree = new flower();
        addObject(floweree,626,174);
        flower flowere = new flower();
        addObject(flowere,626,274);
        flower flowerr = new flower();
        addObject(flowerr,626,374);
    }
}
