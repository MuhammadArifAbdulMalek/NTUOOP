import java.util.Scanner;
public class ReverseInt {
	public static void main(String[] args) {

		int inNumber;   // to be input
     	int inDigit;    // each digit
      	int sum = 0;
      	Scanner in = new Scanner(System.in);

      System.out.print("Enter a positive integer: ");
      inNumber = in.nextInt();

	  System.out.print("The reverse is: ");

      while (inNumber > 0) {
         inDigit = inNumber % 10; // extract the "last" digit
         inNumber /= 10;          // drop "last" digit
   
   		System.out.print(""+inDigit);
      }
      
      
      in.close();

    }
}
      