import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class MusuhRaja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusuhRaja extends Musuh
{
    public MusuhRaja(){
        super(1);
    }
    
    public MusuhRaja(int jenis){
        super(jenis);
        setNyawa(200);
        setImage("alligator.png");
    }
    
    /**
     * Act - do whatever the MusuhRaja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        gerakAcak();
        tembak(300);
        gerakAcakPutar();
        hindar();
        cekKena();
        
    }
    
    public void gerakAcak()
    {
        int tambahan = 0;
        tambahan = Greenfoot.getRandomNumber(2);
        if (tambahan % 2 == 0) {
            setLocation(getX() + Greenfoot.getRandomNumber(5), getY() + Greenfoot.getRandomNumber(5));
        }
        else {
            setLocation(getX() - Greenfoot.getRandomNumber(5), getY() - Greenfoot.getRandomNumber(5));
        }
    }
    
    public void gerakAcakPutar(){
        move(10);
        turn(3);
        
        if(isAtEdge()){
          turn(50) ;
        };
    }
    
    public void hindar(){        
        if(!getObjectsInRange(100, Cewe.class).isEmpty()){
            Actor cw = this.getObjectsInRange(200, Cewe.class).get(0);
            //getWorld().showText("dddd"+cw.getX(), 400, 300);
            setLocation(cw.getX()- ((Greenfoot.getRandomNumber(3)+1)*100),cw.getY()-(Greenfoot.getRandomNumber(3)+1)*100);
            
        }else{
            getWorld().showText("    ", 400, 300);
        }
               
        return;
    }
}
