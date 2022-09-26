import java.util.Scanner;
public class Factorial {
      public static void main (String[] args) {
      	int integer, factorial=1;
      	Scanner in = new Scanner(System.in);

      	System.out.println("Enter an integer:");
      	integer = in.nextInt();

      	for (int number = 1; number <= integer ; ++number) {
      		factorial *= number;
      	}

      	System.out.println(" The Factorial of " +integer+ " is: " +factorial);

      	in.close();
    }
}