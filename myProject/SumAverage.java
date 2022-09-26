import java.util.Scanner;
public class SumAverage {
      public static void main (String[] args) {
            // Declare variables
            int lowerbound, upperbound, sum = 0;
            double average;
            Scanner in = new Scanner(System.in);
      
            // Prompt and read inputs as "int"
            System.out.println("Enter the lowerbound: ");
            lowerbound = in.nextInt();
            System.out.println("Enter the upperbound: ");
            upperbound = in.nextInt();
      
            // Compute sum using a for-loop
            for (int number = lowerbound; number <= upperbound; ++number) {
            sum += number;

            }       
            
      
      // Compute average
      // Take note that int/int gives int. Type casting needed.
      // The total count is (upperbound - lowerbound + 1)
      average = (double)sum / (upperbound - lowerbound + 1);

      
      // Display results
      System.out.println("The sum is: " +sum);
      System.out.printf("The average is: %.2f", average);
      in.close();

      } 
}
