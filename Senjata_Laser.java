import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gunshot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Senjata_Laser  extends Actor
{
    /**
     * Act - do whatever the gunshot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 10;
    public void act() 
    {
        move();
        collisionEnemy();
        collisionStone();
        checkWorldEnd();
    }

    public void collisionEnemy()
    {
        Musuh b = (Musuh)getOneIntersectingObject (Musuh.class);
        if (b != null)
            b.gone();
    }

   
    public void collisionStone()
    {
        Batu_Meteor b = (Batu_Meteor)getOneIntersectingObject (Batu_Meteor.class);
        if (b != null)
        b.gone();
    }

    
    public void move()
    {
        setLocation (getX() , getY()- speed);
    }

    public void checkWorldEnd()
    {       
        if (getY() <=0)
            getWorld().removeObject(this);
    }
}