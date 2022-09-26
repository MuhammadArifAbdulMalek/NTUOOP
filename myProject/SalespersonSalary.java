import java.util.Scanner;
public class SalespersonSalary {
      public static void main (String[] args) {

      final double BASE_SALARY = 1000;
      final double COMMISSION_RATE = 0.15;
      final int SENTINEL = -1;
      Scanner in = new Scanner(System.in);

      int sales;       // Input gross sales
      double salary;   // Salary to be computed

      // Read the first input to "seed" the while loop
      System.out.print("Enter sales in dollars (or -1 to end): ");
      sales =  in.nextInt();

      while (sales != SENTINEL) {
         // Compute the salary in "double"
         salary = (double)BASE_SALARY + sales*COMMISSION_RATE;

         // Print results rounded to 2 decimal places
         System.out.printf("Salary is: $%.2f%n%n", salary);

         // Read the next input
         System.out.print("Enter sales in dollars (or -1 to end): ");
         sales =  in.nextInt();
         // Repeat the loop body, only if the input is not the SENTINEL value.
         // Take note that you need to repeat these two statements inside/outside the loop!
      }
      System.out.println("bye");
      in.close();

    }
}