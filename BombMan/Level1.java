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

        Wall wall = new Wall();
        addObject(wall,82,326);
        WallSide wallSide = new WallSide();
        addObject(wallSide,154,278);
        Wall wall2 = new Wall();
        addObject(wall2,228,230);
        WallSide wallSide2 = new WallSide();
        addObject(wallSide2,393,193);
        WallSide wallSide3 = new WallSide();
        addObject(wallSide3,590,41);
        Wall wall3 = new Wall();
        addObject(wall3,320,143);
        wall3.setLocation(351,143);
        wall3.setLocation(351,143);
        wall3.setLocation(330,140);
        wall3.setLocation(330,140);
        wallSide2.setLocation(401,194);
        wallSide2.setLocation(401,194);
        wallSide2.setLocation(417,188);
        wallSide2.setLocation(417,188);
        Wall wall4 = new Wall();
        addObject(wall4,491,140);
        WallSide wallSide4 = new WallSide();
        addObject(wallSide4,128,41);
        WallSide wallSide5 = new WallSide();
        addObject(wallSide5,599,358);
        Wall wall5 = new Wall();
        addObject(wall5,511,321);
        WallSide wallSide6 = new WallSide();
        addObject(wallSide6,526,273);
        WallSide wallSide7 = new WallSide();
        addObject(wallSide7,260,92);
        Wall wall6 = new Wall();
        addObject(wall6,82,163);
        WallSide wallSide8 = new WallSide();
        addObject(wallSide8,293,357);
        Wall wall7 = new Wall();
        addObject(wall7,554,224);
        WallSide wallSide9 = new WallSide();
        addObject(wallSide9,419,89);
        wall5.setLocation(467,325);
        wallSide9.setLocation(421,116);
        wall4.setLocation(444,120);
        wall4.setLocation(504,138);
        wall4.setLocation(504,138);
        wallSide9.setLocation(489,83);
        wall4.setLocation(436,139);
        wall4.setLocation(436,139);
        wallSide9.setLocation(507,100);
        wallSide9.setLocation(507,100);
        wallSide2.setLocation(418,149);
        wallSide7.setLocation(262,129);
        wallSide7.setLocation(262,129);
        wallSide2.setLocation(385,221);
        wallSide9.setLocation(378,78);
        wall4.setLocation(438,142);
        wall4.setLocation(491,143);
        wall4.setLocation(491,143);
        wallSide7.setLocation(255,88);
        wallSide7.setLocation(255,88);
        wallSide2.setLocation(387,171);
        wallSide2.setLocation(387,171);
        wallSide9.setLocation(408,59);
        wallSide9.setLocation(408,59);
        wall4.setLocation(454,140);
        wallSide2.setLocation(420,170);
        wallSide2.setLocation(420,170);
        wallSide7.setLocation(254,113);
        wallSide7.setLocation(256,113);
        wallSide9.setLocation(446,41);
        wall3.setLocation(248,137);
        wall3.setLocation(334,136);
        wallSide7.setLocation(257,-2);
        wallSide2.setLocation(384,192);
        wallSide2.setLocation(384,192);
        wall3.setLocation(305,136);
        wall4.setLocation(511,135);
        wallSide9.setLocation(448,15);
        wallSide9.setLocation(448,15);
        wallSide7.setLocation(255,51);
        wallSide9.setLocation(384,120);
        wallSide9.setLocation(386,155);
        wallSide9.setLocation(412,84);
        wallSide9.setLocation(412,84);
        wall3.setLocation(374,135);
        wall3.setLocation(373,134);
        wallSide2.setLocation(407,153);
        wallSide2.setLocation(407,153);
        wallSide7.setLocation(228,97);
        wallSide7.setLocation(228,97);
        wallSide9.setLocation(407,7);
        wallSide9.setLocation(415,14);
        wallSide9.setLocation(415,14);
        wallSide2.setLocation(379,180);
        wallSide2.setLocation(379,180);
        wallSide9.setLocation(333,32);
        wallSide9.setLocation(341,38);
        wallSide9.setLocation(341,38);
        wall4.setLocation(525,135);
        wall3.setLocation(371,134);
        wallSide2.setLocation(384,171);
        wall4.setLocation(470,138);
        wall4.setLocation(470,138);
        Coin coin = new Coin();
        addObject(coin,645,26);
        Coin coin2 = new Coin();
        addObject(coin2,645,126);
        Coin coin3 = new Coin();
        addObject(coin3,658,365);
        Coin coin4 = new Coin();
        addObject(coin4,655,263);
        Coin coin5 = new Coin();
        addObject(coin5,456,22);
        Coin coin6 = new Coin();
        addObject(coin6,278,21);
        Coin coin7 = new Coin();
        addObject(coin7,173,21);
        Coin coin8 = new Coin();
        addObject(coin8,51,22);
        Coin coin9 = new Coin();
        addObject(coin9,75,280);
        Coin coin10 = new Coin();
        addObject(coin10,465,272);
        Coin coin11 = new Coin();
        addObject(coin11,337,273);
        Coin coin12 = new Coin();
        addObject(coin12,221,275);
        coin9.setLocation(61,276);
        Coin coin13 = new Coin();
        addObject(coin13,220,371);
        Coin coin14 = new Coin();
        addObject(coin14,466,369);
        Coin coin15 = new Coin();
        addObject(coin15,235,180);
        Coin coin16 = new Coin();
        addObject(coin16,467,170);
        Fly fly = new Fly();
        addObject(fly,30,59);
        Fly fly2 = new Fly();
        addObject(fly2,346,208);
        Fly fly3 = new Fly();
        //<<<<<<< HEAD
        //addObject(fly3,489,297);
        Coin coin17 = new Coin();
        addObject(coin17,59,196);
        coin2.setLocation(653,178);
        coin2.setLocation(653,178);
        Player player = new Player();
        addObject(player,42,362);
        wall4.setLocation(547,130);
        wall4.setLocation(547,130);
        coin6.setLocation(284,33);
        Snake snake = new Snake();
        addObject(snake,284,33);
        coin14.setLocation(465,363);
        Snake snake2 = new Snake();
        addObject(snake2,465,363);
        wall4.setLocation(670,136);
        wall4.setLocation(670,136);

        addObject(fly3,86,204);
        Fly fly4 = new Fly();
        addObject(fly4,671,254);
        Fly fly5 = new Fly();
        addObject(fly5,307,138);
        Fly fly6 = new Fly();
        addObject(fly6,332,336);
        Fly fly7 = new Fly();
        addObject(fly7,22,366);
        Fly fly8 = new Fly();
        addObject(fly8,647,28);
        Fly fly9 = new Fly();
        addObject(fly9,434,195);
        Fly fly10 = new Fly();
        addObject(fly10,93,273);
        Fly fly11 = new Fly();
        addObject(fly11,76,111);
        Fly fly12 = new Fly();
        addObject(fly12,656,346);
        removeObject(fly8);
        //removeObject(coin27);
        removeObject(fly12);
        removeObject(fly3);
        removeObject(fly5);
        removeObject(fly2);
        //Player player = new Player();
        addObject(player,163,31);
        //>>>>>>> 415d07d4a8b4a799e3b50a9403112cb87af0d8c7
        removeObject(fly11);
        removeObject(fly7);
        removeObject(fly6);
        removeObject(fly4);
    }
}
