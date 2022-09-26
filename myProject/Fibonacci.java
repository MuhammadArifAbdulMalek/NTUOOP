public class Fibonacci{
	public static void main(String[] args) {
		int n = 3;
		int fn;
		int fnMinus1 = 1;   // F(n-1), init to F(2)
      	int fnMinus2 = 1;   // F(n-2), init to F(1)
      	int nMax = 20;

      	double sum = fnMinus1 + fnMinus2;  // Need sum to compute average
      	double average;

      	System.out.println("The first " + nMax + " Fibonacci numbers are:");
      	System.out.print(+fnMinus2);
      	System.out.print(" ");
      	System.out.print(+fnMinus1);
      	System.out.print(" ");

      	while (n <= nMax) {  // n starts from 3
            // n = 3, 4, 5, ..., nMax
         // Compute F(n), print it and add to sum
         fn = fnMinus1 + fnMinus2;
         System.out.print(+fn);
         System.out.print(" ");

         // Increment the index n and shift the numbers for the next iteration
         ++n;
         fnMinus2 = fnMinus1;
         fnMinus1 = fn;

         sum += fn; 
      }
     	average = sum/nMax;
     	System.out.println("");
     	System.out.print("The average of " + nMax + " Fibonacci numbers is " +average);
    }

}
