import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends MainWorld
{
    
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Wall2 wall2 = new Wall2();
        addObject(wall2,59,330);
        Wall2 wall22 = new Wall2();
        addObject(wall22,180,329);
        WallSide2 wallSide2 = new WallSide2();
        addObject(wallSide2,235,281);
        wallSide2.setLocation(235,281);
        wallSide2.setLocation(235,281);
        WallSide2 wallSide22 = new WallSide2();
        addObject(wallSide22,85,40);
        Wall2 wall23 = new Wall2();
        addObject(wall23,141,89);
        WallSide2 wallSide23 = new WallSide2();
        addObject(wallSide23,271,41);
        WallSide2 wallSide24 = new WallSide2();
        addObject(wallSide24,353,96);
        WallSide2 wallSide25 = new WallSide2();
        addObject(wallSide25,441,42);
        Wall2 wall24 = new Wall2();
        addObject(wall24,409,144);
        Wall2 wall25 = new Wall2();
        addObject(wall25,180,229);
        WallSide2 wallSide26 = new WallSide2();
        addObject(wallSide26,354,194);
        Wall2 wall26 = new Wall2();
        addObject(wall26,289,144);
        WallSide2 wallSide27 = new WallSide2();
        addObject(wallSide27,592,148);
        Wall2 wall27 = new Wall2();
        addObject(wall27,641,200);
        wallSide27.setLocation(586,176);
        wallSide27.setLocation(586,176);
        wallSide27.setLocation(588,139);
        wallSide27.setLocation(588,139);
        Wall2 wall28 = new Wall2();
        addObject(wall28,399,328);
        WallSide2 wallSide28 = new WallSide2();
        addObject(wallSide28,453,281);
        Wall2 wall29 = new Wall2();
        addObject(wall29,521,327);
        wall29.setLocation(499,324);
        wall29.setLocation(545,319);
        removeObject(wall29);
        addObject(wall29,522,328);
        WallSide2 wallSide29 = new WallSide2();
        addObject(wallSide29,114,197);
        Wall2 wall210 = new Wall2();
        addObject(wall210,419,227);
        wall29.setLocation(560,328);
        wallSide28.setLocation(474,296);
        wallSide28.setLocation(474,296);
        wall28.setLocation(457,320);
        wall28.setLocation(457,320);
        wall29.setLocation(494,323);
        wallSide28.setLocation(476,247);
        removeObject(wall28);
        wallSide28.setLocation(482,274);
        wall29.setLocation(555,309);
        wall29.setLocation(555,309);
        WallSide2 wallSide210 = new WallSide2();
        addObject(wallSide210,353,279);
        Wall2 wall211 = new Wall2();
        addObject(wall211,575,86);
        Coin coin = new Coin();
        addObject(coin,646,141);
        Coin coin2 = new Coin();
        addObject(coin2,644,40);
        Coin coin3 = new Coin();
        addObject(coin3,533,37);
        Coin coin4 = new Coin();
        addObject(coin4,519,141);
        Coin coin5 = new Coin();
        addObject(coin5,399,104);
        Coin coin6 = new Coin();
        addObject(coin6,396,22);
        Coin coin7 = new Coin();
        addObject(coin7,302,23);
        Coin coin8 = new Coin();
        addObject(coin8,295,102);
        Coin coin9 = new Coin();
        addObject(coin9,164,25);
        Coin coin10 = new Coin();
        addObject(coin10,529,263);
        Coin coin11 = new Coin();
        addObject(coin11,660,266);
        Coin coin12 = new Coin();
        addObject(coin12,654,370);
        Coin coin13 = new Coin();
        addObject(coin13,525,364);
        Coin coin14 = new Coin();
        addObject(coin14,407,272);
        coin14.setLocation(405,263);
        Coin coin15 = new Coin();
        addObject(coin15,166,281);
        Coin coin16 = new Coin();
        addObject(coin16,37,276);
        Coin coin17 = new Coin();
        addObject(coin17,35,157);
        Coin coin18 = new Coin();
        addObject(coin18,29,26);
        Coin coin19 = new Coin();
        addObject(coin19,295,193);
        Coin coin20 = new Coin();
        addObject(coin20,290,266);
        Coin coin21 = new Coin();
        addObject(coin21,401,358);
        Coin coin22 = new Coin();
        addObject(coin22,171,155);
        Snake snake = new Snake();
        addObject(snake,387,193);
        Snake snake2 = new Snake();
        addObject(snake2,29,214);
        snake.setLocation(465,38);
        snake.setLocation(465,38);
        Fly fly = new Fly();
        addObject(fly,22,62);
        Fly fly2 = new Fly();
        addObject(fly2,396,310);
        Fly fly3 = new Fly();
        addObject(fly3,641,173);
        Player player = new Player();
        addObject(player,56,367);
    }
}
