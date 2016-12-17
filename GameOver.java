import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private SimpleTimer timer = new SimpleTimer();
    
    public void prepare(){
        timer.mark();
    }
    
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(timer.millisElapsed()>500){
            //setLocation(Greenfoot.getRandomNumber(100) , Greenfoot.getRandomNumber(100));
            move(3);
            turn(1);
        
            if(isAtEdge()){
              turn(5) ;
            };
            updateImage();
            timer.mark();
        }
    }    
    
    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage("smiley1.png");
        GreenfootImage text = new GreenfootImage("Game Over, Anda juara", 22, Color.BLACK, transparent);
        
        if (text.getWidth() > image.getWidth() - 20)
        {
            image.scale(text.getWidth() + 20, image.getHeight()+40);
        }
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);       
    }
}
