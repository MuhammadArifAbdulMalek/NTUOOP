import java.util.Scanner;   
public class OddEven {  
   public static void main (String[] args) {
      Scanner in = new Scanner(System.in); 
      int numberIn;
      
      System.out.print("Enter an integer: ");
      numberIn = in.nextInt();
      
      
      if (numberIn % 2 == 0) {      
         System.out.println(numberIn+ " is even");
      } else {
         System.out.println(numberIn+ " is odd");
      }

      System.out.println("bye");
      in.close();
   }
}