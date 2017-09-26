import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pawn extends ChessPiece
{
    public Pawn(String chessPieceColor)
    {
        super(chessPieceColor);
        if (color=="WHITE") 
        {
            this.setImage("baby1.png");
            
        }
        else
        {
            this.setImage("baby2.png"); 
        }
    }
    
    public ValidMove getValidMove()
    {
        ChessPiece front1move = (ChessPiece)getOneObjectAtOffset(0*direction,1*direction,ChessPiece.class);
        ChessPiece front2move = (ChessPiece)getOneObjectAtOffset(0*direction,2*direction,ChessPiece.class);
        ChessPiece diagmoveleft = (ChessPiece)getOneObjectAtOffset(1*direction,1*direction,ChessPiece.class);
        ChessPiece diagmoveright = (ChessPiece)getOneObjectAtOffset(-1*direction,1*direction,ChessPiece.class);
        
        if(diagmoveleft!=null && diagmoveleft.color!=this.color)
        {
           return new ValidMove(this.getX()+1*direction,this.getY()+1*direction, diagmoveleft);
        }
        else
         if(diagmoveright!=null && diagmoveright.color!=this.color)
        {
           return new ValidMove(this.getX()-1*direction,this.getY()+1*direction, diagmoveright);
        }
        else
        if (front1move==null && 
            front2move==null &&
            firstMove==true) 
            {
              return new ValidMove(this.getX(),this.getY()+2*direction, null);
            }
        else if (front1move==null)
            return new ValidMove(this.getX(),this.getY()+1*direction, null);
        
        return null;
    }
    
    
    /**
     * Act - do whatever the Pawn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        // Add your action code here.
    }    
}
