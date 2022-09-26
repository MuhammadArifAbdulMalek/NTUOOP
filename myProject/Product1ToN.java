public class Product1ToN {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      long product = 1;          // The accumulated sum, init to 0 
      int lowerbound = 1;
      int upperbound = 13;

      // Use a for-loop to sum from lowerbound to upperbound
      for (int number = lowerbound; number <= upperbound; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         product *= number;     // same as "sum = sum + number"
      }
      // Compute average in double. Beware that int / int produces int!
      // Print sum and average
         System.out.println("The product is " +product);
         
   }
}