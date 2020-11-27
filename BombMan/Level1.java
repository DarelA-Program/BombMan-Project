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
        addObject(wall,502,186);
        wall.setLocation(207,377);
        wall.setLocation(195,388);
        wall.setLocation(175,375);
        Wall wall2 = new Wall();
        addObject(wall2,175,375);
        Wall wall3 = new Wall();
        addObject(wall3,345,295);
        Wall wall4 = new Wall();
        addObject(wall4,146,233);
        Wall wall5 = new Wall();
        addObject(wall5,561,208);
        Wall wall6 = new Wall();
        addObject(wall6,580,383);
        Wall wall7 = new Wall();
        addObject(wall7,307,159);
        Wall wall8 = new Wall();
        addObject(wall8,6,69);
        Wall wall9 = new Wall();
        addObject(wall9,554,57);
        Wall wall10 = new Wall();
        addObject(wall10,253,89);
        wall7.setLocation(136,151);
        wall10.setLocation(337,60);
        wall7.setLocation(322,145);
        wall7.setLocation(322,145);
        wall4.setLocation(65,237);
        wall3.setLocation(231,257);
        wall6.setLocation(507,336);
        wall5.setLocation(513,193);
        wall7.setLocation(345,176);
        wall7.setLocation(345,176);
        wall10.setLocation(370,109);
        wall10.setLocation(325,84);
        wall3.setLocation(312,277);
        wall7.setLocation(164,169);
        wall7.setLocation(164,169);
        Coin coin = new Coin();
        addObject(coin,565,377);
        Coin coin2 = new Coin();
        addObject(coin2,501,376);
        Coin coin3 = new Coin();
        addObject(coin3,433,374);
        Coin coin4 = new Coin();
        addObject(coin4,357,374);
        Coin coin5 = new Coin();
        addObject(coin5,357,324);
        Coin coin6 = new Coin();
        addObject(coin6,435,297);
        Coin coin7 = new Coin();
        addObject(coin7,501,296);
        Coin coin8 = new Coin();
        addObject(coin8,567,295);
        Coin coin9 = new Coin();
        addObject(coin9,563,233);
        Coin coin10 = new Coin();
        addObject(coin10,492,237);
        Coin coin11 = new Coin();
        addObject(coin11,426,230);
        coin10.setLocation(492,229);
        wall7.setLocation(219,188);
        Coin coin12 = new Coin();
        addObject(coin12,351,228);
        Coin coin13 = new Coin();
        addObject(coin13,352,161);
        Coin coin14 = new Coin();
        addObject(coin14,433,159);
        Coin coin15 = new Coin();
        addObject(coin15,515,158);
        Coin coin16 = new Coin();
        addObject(coin16,262,152);
        coin13.setLocation(352,159);
        coin13.setLocation(352,152);
        coin14.setLocation(430,150);
        coin15.setLocation(517,145);
        Coin coin17 = new Coin();
        addObject(coin17,173,147);
        Coin coin18 = new Coin();
        addObject(coin18,71,144);
        coin16.setLocation(262,141);
        coin16.setLocation(262,141);
        coin13.setLocation(359,145);
        coin13.setLocation(359,145);
        coin14.setLocation(440,145);
        Coin coin19 = new Coin();
        addObject(coin19,264,228);
        Coin coin20 = new Coin();
        addObject(coin20,238,320);
        Coin coin21 = new Coin();
        addObject(coin21,143,320);
        Coin coin22 = new Coin();
        addObject(coin22,62,318);
        Coin coin23 = new Coin();
        addObject(coin23,405,30);
        Coin coin24 = new Coin();
        addObject(coin24,315,30);
        Coin coin25 = new Coin();
        addObject(coin25,212,29);
        Coin coin26 = new Coin();
        addObject(coin26,110,30);
        Coin coin27 = new Coin();
        addObject(coin27,154,79);
        coin13.setLocation(361,132);
        coin14.setLocation(440,126);
        coin15.setLocation(521,136);
        coin16.setLocation(260,126);
        coin16.setLocation(260,126);
        coin17.setLocation(169,132);
        coin18.setLocation(69,133);
        Coin coin28 = new Coin();
        addObject(coin28,63,192);
        Coin coin29 = new Coin();
        addObject(coin29,523,26);
        coin5.setLocation(353,303);
        coin5.setLocation(353,303);
        coin9.setLocation(562,228);
        coin17.setLocation(186,120);
        coin18.setLocation(95,125);
        coin26.setLocation(54,27);
        coin27.setLocation(140,25);
        coin26.setLocation(40,32);
        coin27.setLocation(122,26);
        coin27.setLocation(122,26);
        coin18.setLocation(61,121);
        coin17.setLocation(156,125);
        coin17.setLocation(156,125);
        coin13.setLocation(353,128);
        coin15.setLocation(520,128);
        coin15.setLocation(520,128);
        coin9.setLocation(635,224);
        coin9.setLocation(635,224);
        coin8.setLocation(633,293);
        wall7.setLocation(293,169);
        coin22.setLocation(26,307);
        coin22.setLocation(28,314);
        coin22.setLocation(22,312);
        coin21.setLocation(114,310);
        coin20.setLocation(227,315);
        coin.setLocation(647,373);
        coin8.setLocation(653,291);
        coin9.setLocation(647,210);
        coin15.setLocation(652,123);
        wall5.setLocation(658,192);
        coin14.setLocation(491,124);
        coin13.setLocation(380,122);
        coin14.setLocation(525,124);
        coin14.setLocation(525,124);
        coin29.setLocation(603,17);
        coin23.setLocation(466,19);
        coin24.setLocation(328,22);
        coin24.setLocation(328,22);
        coin25.setLocation(208,22);
        coin27.setLocation(122,13);
        coin27.setLocation(123,20);
        coin24.setLocation(350,17);
        coin25.setLocation(262,21);
        coin27.setLocation(154,18);
        coin26.setLocation(48,8);
        coin14.setLocation(513,125);
        coin10.setLocation(544,210);
        coin10.setLocation(544,210);
        coin9.setLocation(652,227);
        coin9.setLocation(652,227);
        coin.setLocation(663,370);
        coin.setLocation(663,370);
        coin11.setLocation(422,209);
        coin11.setLocation(422,209);
        coin12.setLocation(339,212);
        coin12.setLocation(330,214);
        coin12.setLocation(330,214);
        coin19.setLocation(218,211);
        coin19.setLocation(218,211);
        coin20.setLocation(233,302);
        coin7.setLocation(556,297);
        coin11.setLocation(434,221);
        coin11.setLocation(434,216);
        coin11.setLocation(434,216);
        coin6.setLocation(435,287);
        coin6.setLocation(435,287);
        coin7.setLocation(528,281);
        coin9.setLocation(638,216);
        coin9.setLocation(638,216);
        coin8.setLocation(649,289);
        coin.setLocation(647,368);
        coin.setLocation(647,368);
        coin2.setLocation(544,372);
        coin2.setLocation(544,372);
        coin21.setLocation(130,303);
        coin21.setLocation(130,303);
        coin22.setLocation(28,306);
        coin28.setLocation(55,205);
        coin28.setLocation(55,205);
        coin17.setLocation(149,115);
        coin26.setLocation(31,24);
        coin19.setLocation(156,212);
        coin19.setLocation(156,212);
        coin12.setLocation(262,213);
        coin11.setLocation(383,218);
        coin11.setLocation(383,218);
        coin12.setLocation(251,208);
        coin12.setLocation(251,208);
        coin10.setLocation(518,210);
        Fly fly = new Fly();
        addObject(fly,584,127);
        coin27.setLocation(166,27);
        Fly fly2 = new Fly();
        addObject(fly2,166,27);
        Fly fly3 = new Fly();
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
        removeObject(coin27);
        removeObject(fly12);
        removeObject(fly3);
        removeObject(fly5);
        removeObject(fly2);
        Player player = new Player();
        addObject(player,163,31);
    }
}
