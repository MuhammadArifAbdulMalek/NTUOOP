import java.util.Scanner;
public class SwapIntegers {  // Save as "CircleComputation.java"
   public static void main(String[] args) {

      int num, number1, number2;
      Scanner in = new Scanner(System.in);

      System.out.print("Enter first integer: ");
      number1 = in.nextInt();
      System.out.print("Enter second integer: ");
      number2 = in.nextInt();
      
      num = number1;
      number1 = number2;
      
      System.out.println("After the swap, first integer is: " +number1+ ", second integer is: " +num);

      in.close();
   }
}