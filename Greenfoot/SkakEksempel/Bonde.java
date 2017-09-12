import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bonde here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bonde extends Brik
{
    private boolean harFlyttetSig=false;
    
    public Bonde(String farven)
    {
        super.farve=farven;
        if(super.farve=="HVID")
        {
            this.setImage("baby1.png");
        }
        else
        {
            this.setImage("baby2.png");
        }
    }
    
    /**
     * Act - do whatever the Bonde wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            int flytAntal = 0;
            if(!harFlyttetSig)
                {
                    flytAntal = 2;
                }
                else
                {
                    flytAntal = 1;
                }
                
            
            if(farve=="HVID")
            {
                this.setLocation(getX(),getY()+flytAntal);
                harFlyttetSig=true;
            }
            else
            {
                this.setLocation(getX(),getY()-flytAntal);
                harFlyttetSig=true;
            }
        }
        // Add your action code here.
    }    
}
