
/**
 * Write a description of class Descending here.
 * 
 * @author Jarom Kraus 
 * @version 3.9.16
 */
public class Descending{
    public static void descending(int n){
        System.out.println(n);
        try{
            Thread.sleep(1000);
        } catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        if(n>0){
            descending(n-1);
        }
   }
   public static  int factorial(int n){
       System.out.println(n);
       if(n == 1){
          return 1;
       }
       else{
           return n * factorial(n - 1);
        }
   }
}
