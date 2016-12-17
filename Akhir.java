import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Akhir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Akhir extends World
{
    

    /**
     * Constructor for objects of class Akhir.
     * 
     */
    public Akhir()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(60, 40, 10);
        prepare();
    }
    
    public Akhir(int Skore)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(60, 40, 10);
        //skore
        prepare();
        
    }
    
    public void prepare(){
        GameOver gameover = new GameOver();
        addObject(gameover,30,30); 
        
        setBackground("brick.jpg");
    }
    
    public void act(){
        showText("Habis", 100, 100);
       
    }
    
    
}
