import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Board() 
    {    
        super(8, 8, 700/8); 
        getBackground().scale(700, 700);
        for(int i=0;i<8;i++)
        {
            this.addObject(new Pawn("WHITE"), i, 1); 
            this.addObject(new Pawn("BLACK"), i, 6); 
        }
        
        
    }
    
}
