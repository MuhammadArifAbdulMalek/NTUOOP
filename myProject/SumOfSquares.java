public class SumOfSquares {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      double sum = 0;          // The accumulated sum, init to 0
      int lowerbound = 1;
      int upperbound = 100;

      // Use a for-loop to sum from lowerbound to upperbound
      for (int number = lowerbound; number <= upperbound; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         sum += number*number;     // same as "sum = sum + number"
      }
      // Compute average in double. Beware that int / int produces int!
      // Print sum and average
         System.out.println("The sum is " +sum);
   }
}