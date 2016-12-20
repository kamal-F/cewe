import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Dunia1 extends Dunia
{
    private Cewe cewe = new Cewe();
  
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Dunia1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(600, 400, 1); 
        
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //addObject(counter,89,50);     
        //Cewe cewe = new Cewe();
        addObject(cewe,420,84);
        MusuhBiasa musuh = new MusuhBiasa(1);
        addObject(musuh,291,256);

        timer1mark();
        //Bom bom = new Bom();
        //addObject(bom,352,188);
        
        //MusuhBiasa musuh2 = new MusuhBiasa(2);
        //addObject(musuh2,224,110);
        
        for(int i=1;i<4;i++){
             addObject(new MusuhBiasa((i%2)+1),Greenfoot.getRandomNumber(400),Greenfoot.getRandomNumber(100));
        }
        
        setBackground("sand.jpg");

    }
    
    public void act(){
       timerX();
       if(cekTotMusuh()==0){
            showText("Anda Menang",getWidth()/2, getHeight()/2);            
            //Greenfoot.stop();
            berhenti();
            
            //Dunia tmpdunia =(Dunia)this;
            //int tmpskore = tmpdunia.getCounter().getValue();
                       
            int tmpskore = getCounter().getValue();
            
            World dunia2 =new Dunia2(tmpskore, cewe.getNyawa());
            
            Greenfoot.setWorld(dunia2);
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
