import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Musuh extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    private int freqTembak = 1000;
    private int nyawa=1;
    
    public Musuh(){
        prepare();
    }
    
    /**
       *jenis raja
       *0 jenis muda
       *1 jenis tua
       */
    public Musuh(int jenis){
       if(jenis==1){
           this.nyawa=1;
           setImage("boy1.png");
       }
       
       if(jenis==2){
           this.nyawa=100;
           setImage("boy2.png");
       }
        
        prepare();
    }
    
    public void setNyawa(int nyawa){
        this.nyawa = nyawa;
    }
    
    public int getNyawa(){
        return this.nyawa;
    }
    
    /**
     * Act - do whatever the Musuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act() 
    {
        // Add your action code here.      
    }
    
    public void prepare(){
        freqTembak = (Greenfoot.getRandomNumber(5)+1)*1000;
    }
    
    public void gerakAcak(){
        setLocation(getX(), getY()-1);
       if(getY()<=0){
        setLocation(Greenfoot.getRandomNumber(200), 400);
        }
    }
    
    public void tembak(int kecepatan){
        if(timer.millisElapsed()>freqTembak){            
            timer.mark();
            freqTembak = (Greenfoot.getRandomNumber(5)+1)*kecepatan;
            getWorld().addObject(new Bom(), getX(), getY());
        }
    }
    
    public boolean cekKena(){
        if(getOneIntersectingObject(Cewe.class)!=null){
          
            this.nyawa--;
            
            if(this.nyawa==0){
                World w =getWorld();
                //PENTING, akses ke counter di dunia
                Dunia myw =(Dunia)w;
                myw.getCounter().add(10);
            
                getWorld().removeObject(this);
            }
                      
            return true;
        }    
        return false;
    }
}
