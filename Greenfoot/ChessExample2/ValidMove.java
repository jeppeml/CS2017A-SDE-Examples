/**
 * Write a description of class ValidMove here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ValidMove  
{
    private int x;
    private int y;
    private ChessPiece hitPiece;
    
    /**
     * Constructor for objects of class ValidMove
     */
    public ValidMove(int xmove, int ymove, ChessPiece piece)
    {
        x=xmove;
        y=ymove;
        hitPiece = piece;
    }

    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public ChessPiece getHitPiece()
    {
        return hitPiece;
    }
}
