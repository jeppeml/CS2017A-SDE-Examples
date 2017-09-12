import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plade extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Plade() 
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(8, 8, 100); 
        getBackground().scale(800, 800);
        
        for(int i=0;i<8;i++)
        {
            addObject(new Bonde("HVID"), i,1);
            addObject(new Bonde("SORT"), i,6);
        }
    }
}
