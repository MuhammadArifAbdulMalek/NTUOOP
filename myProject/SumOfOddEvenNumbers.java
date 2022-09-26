public class SumOfOddEvenNumbers {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      double sumeven = 0;
      double sumodd = 0;          // The accumulated sum, init to 0
      int lowerbound = 1;
      int upperbound = 100;
      double absdiff;

      // Use a for-loop to sum from lowerbound to upperbound
      for (int number = lowerbound; number <= upperbound; ++number) {
         if (number % 2 == 1)  {// The loop index variable number = 1, 2, 3, ..., 99, 100
            sumodd += number;
         } else {
            sumeven += number;
         }
      }

         if(sumodd > sumeven) {
            absdiff = sumodd - sumeven;
         } else {
            absdiff = sumeven - sumodd;
         }
              
      // Compute average in double. Beware that int / int produces int!
      // Print sum and average
         System.out.println("The sum of all odd numbers is " +sumodd);
         System.out.println("The sum of all even numbers is " +sumeven);
         System.out.println("The absolute difference between the odd and even numbers is " +absdiff);
   }
}