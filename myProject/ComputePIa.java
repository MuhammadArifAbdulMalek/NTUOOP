import java.util.Scanner;
public class ComputePIa {   
   public static void main (String[] args) {
      double sum = 0.0;
      int maxDenominator;   // Try 10000, 100000, 1000000
      double pi;
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter the maximum denominator: ");
      maxDenominator = in.nextInt();
      for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {
            // denominator = 1, 3, 5, 7, ..., maxDenominator
         if (denominator % 4 == 1) {
            sum += 1.0/denominator;
         } else if (denominator % 4 == 3) {
            sum -= 1.0/denominator;
         } else {   // remainder of 0 or 2
            System.out.println("impossible - error in logic");
         }      
      }
      
      System.out.printf("The PI computed is: %.10f" , 4*sum);
   }
}
