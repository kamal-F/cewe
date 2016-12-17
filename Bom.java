import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bom extends Actor
{
    /**
     * Act - do whatever the Bom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX()+1, getY());
        if(cekKena()==false && isAtEdge()){
            getWorld().removeObject(this);
        }
        
       
    }    
    
    public boolean cekKena(){
        Actor cw = getOneIntersectingObject(Cewe.class);
        
        if(cw != null){            
            Cewe mycw = (Cewe)cw;
            mycw.kurangiNyawa();
           
           
            World w =getWorld();
            
            //w.showText("nyawa="+ mycw.getNyawa(), 300, 300);        
            w.removeObject(this);
            return true;
        }
        return false;
    }
}
