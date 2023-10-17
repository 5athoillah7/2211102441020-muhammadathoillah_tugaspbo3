import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pesawat  extends Actor
{
    private int direction = -1;
    private int speed = 5;
    private boolean dead = false;
    private int scoree = 0;
    private int counter = 3;

    public void act() 
    {
        if(Greenfoot.isKeyDown("up"))
            setLocation (getX(), getY() -speed);
        else if (Greenfoot.isKeyDown("down"))
            setLocation (getX(), getY() +speed);
        else if (Greenfoot.isKeyDown ("left"))
            setLocation (getX() -speed, getY());
        else if (Greenfoot.isKeyDown ("right"))
            setLocation (getX() +speed, getY());

        if ("space".equals(Greenfoot.getKey()))
        {
            shoot();
        }
    }    

    public void PlaneDisappear()
    {
        Galaxy s = (Galaxy)getWorld();
        scoree = s.points();
        System.out.println ("Permain Berakhir");
        System.out.println ("Skor Anda Adalah " + scoree);
        getWorld().removeObject(this);
        Greenfoot.stop();
    }

    public void shoot()
    {
        Senjata_Laser b = new Senjata_Laser();
        getWorld().addObject(b, getX(), getY());
    }
}

