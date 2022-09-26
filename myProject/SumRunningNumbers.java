/** Loop example: Sum from 1 to a given upperbound */
public class SumRunningNumbers {
public static void main(String[] args) {
int sum = 0; // For accumulate numbers, init to 0
int upperbound = 100; // Sum from 1 to this upperbound
// Use a loop to repeatedly add 1, 2,...,upperbound into sum
int number = 1;
while (number <= upperbound) {
// number = 1, 2, 3, ..., upperbound for each iteration
sum = sum + number;
++number;
}
// Print result
System.out.println("The sum is " + sum);
}
}