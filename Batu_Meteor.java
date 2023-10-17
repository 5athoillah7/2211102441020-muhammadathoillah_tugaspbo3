import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lighthouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Batu_Meteor  extends Actor
{
    /**
     * Act - do whatever the lighthouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 1;
    public void act() 
    {
        move();
        collisionPlane();
    }    

    public void move()
    {
        setLocation (getX () , getY () + speed);
    }

    public void gone()
    {
        score ();
        getWorld().removeObject(this);
    }

    public void score()
    {
        Galaxy o= (Galaxy)getWorld();
        o.AddP(5);
    }

    public void collisionPlane()
    {
        if (getY() >= 599)
        {
            getWorld().removeObject(this);
        }
        else
        {
            Pesawat b = (Pesawat)getOneIntersectingObject (Pesawat.class);
            if (b != null)
                b.PlaneDisappear();
        }
    }
}
