import java.util.Scanner;
public class HarmonicSum {   
   public static void main (String[] args) {
      // Define variables
      int maxDenominator;  // Use a more meaningful name instead of n
      double sumL2R = 0.0;         // Sum from left-to-right
      double sumR2L = 0.0;         // Sum from right-to-left
      double absDiff;              // Absolute difference between the two sums
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter the max denominator: ");
      maxDenominator =  in.nextInt();
      // for-loop for summing from left-to-right
      for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
          // denominator = 1, 2, 3, 4, 5, ..., maxDenominator
          sumL2R += (1.0/denominator) ;
          // Beware that int/int gives int, e.g., 1/2 gives 0.
      }
      System.out.println("The sum from left-to-right is: " + sumL2R);

      // for-loop for summing from right-to-left
     for (int denominator = maxDenominator; denominator >= 1; --denominator) {
          sumR2L += (1.0/denominator) ;
      }
      System.out.println("The sum from right-to-left is: " + sumR2L);

      // Find the absolute difference and display
      if (sumL2R > sumR2L) {
        absDiff = sumL2R - sumR2L;
      }
      else {
        absDiff = sumR2L - sumL2R;
      }
      System.out.println("The absolute difference is: " + absDiff);
      in.close();
   }
}