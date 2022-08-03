import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
         sleep(2); //gato duerma
        if(isBored())
        {
           shoutHooray ();
        }
        eat ();
        dance ();
        sleep(2);
        eat ();
        dance ();
        shoutHooray ();
        move (6);
        turn (5);
        sleep(1);
        eat ();
        walkRight (5);
        walkLeft (5);
    } 
}


    