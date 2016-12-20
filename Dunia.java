import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dunia extends World
{
    private Counter counter = new Counter("Nilai=");
    private SimpleTimer timer = new SimpleTimer();
    private SimpleTimer timer1= new SimpleTimer();
    private boolean isBerhenti = false;
    
    private int waktu = 0;
    
    private Label labelWaktu = new Label("waktu", 20);
    private Label labelNyawa = new Label("Nyawa", 20);
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Dunia()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter,89,50); 
        addObject(labelWaktu, 90,100);        
        addObject(labelNyawa,90,150);
    }
    
    public Counter getCounter(){
        return counter;
    }
    
    public void act(){
    }
    
    public void timerX(){
        if(timer.millisElapsed()>1000){
            waktu++;
            timer.mark();
            
        }
        
        if(waktu >= 20){
            showText("tamat", getWidth()/2, getHeight()/2);
            //Greenfoot.stop();
            berhenti();
        }

         if(isBerhenti){
            if(timer1.millisElapsed()>500){                
                Greenfoot.stop();
                isBerhenti=false;
            }
        }
    }
    
    public int cekTotMusuh(){
        int jml=0;
        List<Musuh> msh =getObjects(Musuh.class);
        return msh.size();
    }
    
    public void berhenti(){    
        if(!isBerhenti){
            isBerhenti = true;
            timer1.mark(); 
        }
    }
    
    public void timer1mark(){
        timer1.mark();
    }
    
    public void showWaktu(){
        labelWaktu.setValue("waktu="+ waktu);        
    }
       
    public void setLabelWaktu(String isi){
        labelWaktu.setValue(isi);
    }
    public void setLabelNyawa(String isi){
        labelNyawa.setValue(isi);
    }
}
