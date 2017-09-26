import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class ChessPiece here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ChessPiece extends Actor
{
    protected String color;
    public boolean firstMove=true;
    public int direction;
    
    public abstract ValidMove getValidMove();

    public ChessPiece(String chessPieceColor)
    {
        color=chessPieceColor;
        if (color=="WHITE") 
        {
            direction=1;
            
        }
        else
        {
             direction=-1;
        }
    }
    
    //in the object you want to click to change the world;
    public void act() {
        super.act();
        if (Greenfoot.mouseClicked(this)) {
            ValidMove vm = this.getValidMove();
            if(vm!=null)
            {
                this.setLocation(vm.getX(), vm.getY());
                firstMove = false;
                if(vm.getHitPiece()!=null)
                    vm.getHitPiece().die();
            }
        }
    }
    
    public void die()
    {
        getWorld().removeObject(this);
    }
}
