import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends MainWorld
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        WallSide wallSide = new WallSide();
        addObject(wallSide,147,204);
        Wall wall = new Wall();
        addObject(wall,151,251);
        Wall wall2 = new Wall();
        addObject(wall2,152,156);
        Wall wall3 = new Wall();
        addObject(wall3,230,339);
        WallSide wallSide2 = new WallSide();
        addObject(wallSide2,307,300);
        WallSide wallSide3 = new WallSide();
        addObject(wallSide3,396,362);
        WallSide wallSide4 = new WallSide();
        addObject(wallSide4,562,363);
        Wall wall4 = new Wall();
        addObject(wall4,546,322);
        Wall wall5 = new Wall();
        addObject(wall5,545,236);
        Wall wall6 = new Wall();
        addObject(wall6,545,150);
        WallSide wallSide5 = new WallSide();
        addObject(wallSide5,470,110);
        Wall wall7 = new Wall();
        addObject(wall7,632,49);
        WallSide wallSide6 = new WallSide();
        addObject(wallSide6,612,191);
        WallSide wallSide7 = new WallSide();
        addObject(wallSide7,379,35);
        Wall wall8 = new Wall();
        addObject(wall8,307,70);
        Wall wall9 = new Wall();
        addObject(wall9,334,202);
        WallSide wallSide8 = new WallSide();
        addObject(wallSide8,100,32);
        RedCoin redCoin = new RedCoin();
        addObject(redCoin,573,16);
        RedCoin redCoin2 = new RedCoin();
        addObject(redCoin2,428,11);
        RedCoin redCoin3 = new RedCoin();
        addObject(redCoin3,508,102);
        RedCoin redCoin4 = new RedCoin();
        addObject(redCoin4,649,104);
        RedCoin redCoin5 = new RedCoin();
        addObject(redCoin5,656,201);
        RedCoin redCoin6 = new RedCoin();
        addObject(redCoin6,610,366);
        RedCoin redCoin7 = new RedCoin();
        addObject(redCoin7,663,291);
        RedCoin redCoin8 = new RedCoin();
        addObject(redCoin8,558,185);
        RedCoin redCoin9 = new RedCoin();
        addObject(redCoin9,498,278);
        RedCoin redCoin10 = new RedCoin();
        addObject(redCoin10,483,365);
        RedCoin redCoin11 = new RedCoin();
        addObject(redCoin11,415,110);
        RedCoin redCoin12 = new RedCoin();
        addObject(redCoin12,266,108);
        RedCoin redCoin13 = new RedCoin();
        addObject(redCoin13,327,164);
        RedCoin redCoin14 = new RedCoin();
        addObject(redCoin14,363,274);
        RedCoin redCoin15 = new RedCoin();
        addObject(redCoin15,355,373);
        RedCoin redCoin16 = new RedCoin();
        addObject(redCoin16,255,297);
        RedCoin redCoin17 = new RedCoin();
        addObject(redCoin17,188,202);
        RedCoin redCoin18 = new RedCoin();
        addObject(redCoin18,316,25);
        RedCoin redCoin19 = new RedCoin();
        addObject(redCoin19,155,34);
        RedCoin redCoin20 = new RedCoin();
        addObject(redCoin20,46,44);
        RedCoin redCoin21 = new RedCoin();
        addObject(redCoin21,51,200);
        RedCoin redCoin22 = new RedCoin();
        addObject(redCoin22,64,308);
        RedCoin redCoin23 = new RedCoin();
        addObject(redCoin23,64,374);
        Fly fly = new Fly();
        addObject(fly,16,93);
        Fly fly2 = new Fly();
        addObject(fly2,14,225);
        Fly fly3 = new Fly();
        addObject(fly3,13,345);
    }
}
