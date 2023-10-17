import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OuterSpace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Galaxy  extends World
{
    private Pesawat hero;
    private int score = 0;
    private int counter = 0;
    /**
     * Constructor for objects of class OuterSpace.
     * 
     */
    public Galaxy()
    {    
        super(640, 600, 1); 
        prepare();
    }

    private void prepare()
    {
        Pesawat plane = new Pesawat();
        addObject(plane, 300, 438);
    }

    public void act()
    {
        counter++;
        if (counter%25 == 0)
        {
            addObject(new Batu_Meteor(), Greenfoot.getRandomNumber(550)+50, 0);
        }

        if (counter%10 == 0)
        {
            addObject(new Musuh(), Greenfoot.getRandomNumber(550)+50, Greenfoot.getRandomNumber(100));
        }
    }

    public void AddP (int points)
    {
        score = score + points;
    }

    public int points ()
    {
        return score;
    }
}

