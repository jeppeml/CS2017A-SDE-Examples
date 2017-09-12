import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartBane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartBane extends World
{
    public Bane bane1;
    public Bane bane2;
    public Bane bane3;
    
    public String tekst;
    /**
     * Constructor for objects of class StartBane.
     * 
     */
    public StartBane()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        bane1 = new Bane();
        bane1.naviText = "dræb";
        
        bane2 = new Bane();
        bane2.naviText = "Løb væk";
        
        bane3= new Bane();
        bane3.naviText = "Kast våd trylledej (+10 til salt)";
        
        tekst = "Du kommer til en vej, med en Orc, hvad gør du?";
        
        
    }
}
