public class SumAverageRunningIntDoWhile {   
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average;   // average in double
      int lowerbound = 111;       
      int upperbound = 8899;
      int number = lowerbound;
      
      do {
         sum += number;
         ++number;                     // update
      } while (number <= upperbound);
      // Compute average in double. Beware that int / int produces int!
      // Print sum and average
         System.out.println("The sum is " +sum);
         System.out.println("The average is "+ (double)sum / upperbound);
   }
}