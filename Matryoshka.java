
/**
 * Write a description of class Matryoshka here.
 * 
 * @author Jarom Kraus
 * @version 3.8.16
 */
import java.awt.Color;
public class Matryoshka{
    private Matryoshka innerDoll; 
    private Color hair;
    private boolean isSanders;
    
    public Matryoshka(Color hair, boolean isDictator){
        innerDoll = null;
        this.hair = null;
        this.isSanders = isSanders;
    }
    public Matryoshka(Matryoshka innerDoll, Color hair,  boolean isDictator){
        this.innerDoll = innerDoll;
        this.hair = hair;
        this.isSanders = isSanders;
    }
    public int numOfDolls(){
        if (innerDoll == null){
            return 1;
        }
        else{
            return 1 + innerDoll.numOfDolls();
        }
    }
    public boolean hasInnerDoll()
    { return innerDoll !=null;}
    public Matryoshka getInnerDoll(){
        return innerDoll;
    }
    public Color getHairColor(){
        return hair;
    }
    public boolean isRed(){
        return hair == Color.RED;
    }
    public int howManyRed(){
        if (innerDoll == null && hair == Color.RED ){
            return 1;
        }
        else if(innerDoll == null){
            return 0;
        }
        else if(hair != Color.RED){
            return innerDoll.howManyRed();
        }
        else{
            return 1 + innerDoll.howManyRed();
        }
    }
    public int howManySanders(){
        if(innerDoll == null && isSanders){
            return 1;
        }
        else if(innerDoll == null){
            return 0;
        }
        else if (!isSanders){
            return innerDoll.howManySanders();
        }
        else{
            return 1 + innerDoll.howManySanders();
        }
    }
}

