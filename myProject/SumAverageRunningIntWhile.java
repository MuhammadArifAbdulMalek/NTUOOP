public class SumAverageRunningIntWhile {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average;   // average in double
      int lowerbound = 1;       
      int upperbound = 100;
      int number = lowerbound;


      while (number <= upperbound) {  // test
         sum += number;
         ++number;                    // update
      }
      // Compute average in double. Beware that int / int produces int!
      // Print sum and average
         System.out.println("The sum is " +sum);
         System.out.println("The average is "+ (double)sum / upperbound);
   }
}