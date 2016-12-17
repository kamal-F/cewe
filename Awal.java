import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Awal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Awal extends World
{
    private SimpleTimer timer = new SimpleTimer();

    /**
     * Constructor for objects of class Awal.
     * 
     */
    public Awal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void prepare(){
        timer.mark();
        setBackground("brick.jpg");
        showText("Selamat bermain", getWidth()/2, getHeight()/2);
    }
    
    public void act(){    
        if(timer.millisElapsed()>4000){
            World dunia1 = new Dunia1();
            Greenfoot.setWorld(dunia1);
        }    
    }
}
