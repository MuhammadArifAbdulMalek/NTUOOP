/** Decision (if and if‐else) Example */
public class CheckNumber {
public static void main(String[] args) {
int number;
int magicNumber = 88;
number = 99; // Set the number
// If test is true, do the body. Else do nothing
if (number > magicNumber) {
System.out.println("Number is greater than magic!");
}
if (number == magicNumber) {
System.out.println("Number is equal to magic!");
}
// If test is true, do the true‐body. Else do the false‐body.
if (number < magicNumber) {
System.out.println("Number is less than magic!");
} else {
System.out.println("Number is NOT less than magic!");
}
System.out.println("Done and bye!");
}
}