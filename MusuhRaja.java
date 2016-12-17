import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        setNyawa(60);
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
}
