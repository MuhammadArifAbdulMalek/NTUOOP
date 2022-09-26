import java.util.Scanner;
public class IncomeTaxCalculatorSentinel {
      public static void main (String[] args) {
      // Declare constants first (variables may use these constants)
      // The keyword "final" marked these as constant (i.e., cannot be changed).
      // Use uppercase words joined with underscore to name constants
      final int SENTINEL = -1; 
      final double TAX_RATE_ABOVE_20K = 0.1;
      final double TAX_RATE_ABOVE_40K = 0.2;
      final double TAX_RATE_ABOVE_60K = 0.3;

      // Declare variables
      int taxableIncome;
      double taxPayable;
      Scanner in = new Scanner(System.in);

      System.out.print("Enter the taxable income (or -1 to end): $");
      taxableIncome = in.nextInt();

      while (taxableIncome != SENTINEL) {
      // Compute tax payable in "double" using a nested-if to handle 4 cases
      if (taxableIncome <= 20000) {         // [0, 20000]
         taxPayable = 0;
      } else if (taxableIncome <= 40000) {  // [20001, 40000]
         taxPayable = (taxableIncome-20000) * 0.1;
      } else if (taxableIncome <= 60000) {  // [40001, 60000]
         taxPayable = 20000*0 + 20000*0.1 + (taxableIncome-40000)*0.2;
      } else {                              // [60001, ]
         taxPayable = 20000*0 + 20000*0.1 + 20000*0.2 + (taxableIncome-60000)*0.3;
      }
      
      System.out.printf("The income tax payable is: $%.2f%n", taxPayable);

      System.out.print("Enter the taxable income (or -1 to end): $");
         taxableIncome = in.nextInt();
            // Repeat the loop body, only if the input is not the SENTINEL value.
            // Take note that you need to repeat these two statements inside/outside the loop!
      }
      System.out.println("bye!");
      in.close();
    }
}