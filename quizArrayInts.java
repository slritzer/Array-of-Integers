
/**
 * quizArrayInts uses an array of integers to print five integers per line.
 * 
 * @Stephanie Ritzer 
 * @March 7, 2011
 */
import java.util.*;
public class quizArrayInts
{
   public static void main() {
       
       int[] integer = new int[100];
       
       for(int i = 0; i < 100; i++) {
           integer[i] = (int)(Math.random() * 100);          
        }
       
       for(int i = 0; i < 100; i++) {
           if((i + 1) %5 == 0)
            System.out.println(integer[i]);
           else
            System.out.print(integer[i] + " ");
        }
    
       
    }
       
       
}
