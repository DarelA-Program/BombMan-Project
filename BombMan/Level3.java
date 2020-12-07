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
        
        setPaintOrder(Counter.class,Border.class );
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Border border = new Border();
        addObject(border,59,200);
        removeObject(border);
        addObject(border,14,201);
        removeObject(border);
        addObject(border,40,198);
        removeObject(border);
        addObject(border,687,195);
        removeObject(border);
        addObject(border,696,206);
        removeObject(border);
        addObject(border,678,198);
        Player player = new Player();
        addObject(player,55,196);
        removeObject(player);
        Player player2 = new Player();
        addObject(player2,26,210);
        Wall2 wall2 = new Wall2();
        addObject(wall2,48,174);
        Wall2 wall22 = new Wall2();
        addObject(wall22,48,247);
        WallSide2 wallSide2 = new WallSide2();
        addObject(wallSide2,110,281);
        Wall2 wall23 = new Wall2();
        addObject(wall23,54,314);
        Wall2 wall24 = new Wall2();
        addObject(wall24,55,392);
        WallSide2 wallSide22 = new WallSide2();
        addObject(wallSide22,2,353);
        WallSide2 wallSide23 = new WallSide2();
        addObject(wallSide23,105,138);
        Wall2 wall25 = new Wall2();
        addObject(wall25,52,89);
        Wall2 wall26 = new Wall2();
        addObject(wall26,56,5);
        WallSide2 wallSide24 = new WallSide2();
        addObject(wallSide24,2,44);
        WallSide2 wallSide25 = new WallSide2();
        addObject(wallSide25,191,33);
        WallSide2 wallSide26 = new WallSide2();
        addObject(wallSide26,195,360);
        Wall2 wall27 = new Wall2();
        addObject(wall27,251,312);
        Wall2 wall28 = new Wall2();
        addObject(wall28,246,75);
        Wall2 wall29 = new Wall2();
        addObject(wall29,247,238);
        WallSide2 wallSide27 = new WallSide2();
        addObject(wallSide27,190,202);
        Wall2 wall210 = new Wall2();
        addObject(wall210,247,154);
        WallSide2 wallSide28 = new WallSide2();
        addObject(wallSide28,306,276);
        WallSide2 wallSide29 = new WallSide2();
        addObject(wallSide29,378,358);
        Wall2 wall211 = new Wall2();
        addObject(wall211,435,314);
        WallSide2 wallSide210 = new WallSide2();
        addObject(wallSide210,372,36);
        Wall2 wall212 = new Wall2();
        addObject(wall212,426,78);
        WallSide2 wallSide211 = new WallSide2();
        addObject(wallSide211,486,112);
        Wall2 wall213 = new Wall2();
        addObject(wall213,428,142);
        WallSide2 wallSide212 = new WallSide2();
        addObject(wallSide212,458,184);
        Wall2 wall214 = new Wall2();
        addObject(wall214,445,231);
        WallSide2 wallSide213 = new WallSide2();
        addObject(wallSide213,498,276);
        RedCoin redCoin = new RedCoin();
        addObject(redCoin,142,262);
        RedCoin redCoin2 = new RedCoin();
        addObject(redCoin2,130,199);
        RedCoin redCoin3 = new RedCoin();
        addObject(redCoin3,140,331);
        RedCoin redCoin4 = new RedCoin();
        addObject(redCoin4,38,40);
        RedCoin redCoin5 = new RedCoin();
        addObject(redCoin5,136,46);
        RedCoin redCoin6 = new RedCoin();
        addObject(redCoin6,143,128);
        RedCoin redCoin7 = new RedCoin();
        addObject(redCoin7,62,350);
        RedCoin redCoin8 = new RedCoin();
        addObject(redCoin8,148,386);
        RedCoin redCoin9 = new RedCoin();
        addObject(redCoin9,210,277);
        RedCoin redCoin10 = new RedCoin();
        addObject(redCoin10,277,276);
        RedCoin redCoin11 = new RedCoin();
        addObject(redCoin11,220,117);
        RedCoin redCoin12 = new RedCoin();
        addObject(redCoin12,289,116);
        RedCoin redCoin13 = new RedCoin();
        addObject(redCoin13,232,35);
        RedCoin redCoin14 = new RedCoin();
        addObject(redCoin14,313,35);
        RedCoin redCoin15 = new RedCoin();
        addObject(redCoin15,449,116);
        RedCoin redCoin16 = new RedCoin();
        addObject(redCoin16,363,114);
        RedCoin redCoin17 = new RedCoin();
        addObject(redCoin17,223,194);
        RedCoin redCoin18 = new RedCoin();
        addObject(redCoin18,303,189);
        RedCoin redCoin19 = new RedCoin();
        addObject(redCoin19,396,189);
        RedCoin redCoin20 = new RedCoin();
        addObject(redCoin20,348,264);
        RedCoin redCoin21 = new RedCoin();
        addObject(redCoin21,436,271);
        RedCoin redCoin22 = new RedCoin();
        addObject(redCoin22,333,364);
        RedCoin redCoin23 = new RedCoin();
        addObject(redCoin23,244,356);
    }
    
     /**
     * Sharks and fireballs will move across the map
     */
    public void act()
    {
        
        if (Greenfoot.getRandomNumber(100) < 2)
        {
            addObject(new Shark(), 669, Greenfoot.getRandomNumber(360)); 
        } 
        
        if (Greenfoot.getRandomNumber(100) < 1.5)
        {
            addObject(new Fireball(), 669, Greenfoot.getRandomNumber(360)); 
        } 
     } 
}
