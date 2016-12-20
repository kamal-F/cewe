import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dunia2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dunia2 extends Dunia
{
    private Cewe cewe = new Cewe();
    private int nyawaJagoan = 0;

    /**
     * Constructor for objects of class Dunia2.
     * 
     */
    public Dunia2()
    {
        prepare();
    }
    
    public Dunia2(int skorelama, int nyawaJagoan){
        getCounter().setValue(skorelama);
        this.nyawaJagoan = nyawaJagoan;
        prepare();
    }
    
    private void prepare(){
        MusuhRaja buaya = new MusuhRaja(2);
        addObject(buaya,299,336);
        
        
        addObject(cewe,420,84);
        cewe.setNyawa(this.nyawaJagoan);
        
        setBackground("paper.jpg");
        
        
        Greenfoot.start();
        
        timer1mark();
    }
    
    public void act(){
      timerX();
       if(cekTotMusuh()==0){
            showText("Anda Menang",getWidth()/2, getHeight()/2);            
            //Greenfoot.stop();
            berhenti();
            Greenfoot.start();
            int tmpskore = getCounter().getValue();
            
            World akhir = new Akhir();
            Greenfoot.setWorld(akhir);
       }
       
       if(cewe.getNyawa()==0){
           showText("Anda kalah",getWidth()/2, getHeight()/2);                        
           berhenti();
       }
       
       //showText("nyawa="+cewe.getNyawa(), 100, 200) ;
       setLabelNyawa("nyawa="+cewe.getNyawa());
       showWaktu();
    }
}
