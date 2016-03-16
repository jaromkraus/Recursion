
/**
 * Write a description of class Runner here.
 * 
 * @author Jarom Kraus 
 * @version 3.8.16
 */
public class Runner{
    public static void main(String[] args ){
        Matryoshka t1 = new Matryoshka(java.awt.Color.GREEN, true);
        Matryoshka t2 = new Matryoshka(t1,java.awt.Color.MAGENTA, true);
        Matryoshka t3 = new Matryoshka(t2,java.awt.Color.CYAN, true);
        Matryoshka t4 = new Matryoshka(t3,java.awt.Color.red,true);
        Matryoshka t5 = new Matryoshka(t4,java.awt.Color.RED, false);
        System.out.println(t5.numOfDolls());
        System.out.println(t2.getHairColor());
        System.out.println(t5.howManyRed());
        System.out.println(t5.howManySanders());
    }
}
