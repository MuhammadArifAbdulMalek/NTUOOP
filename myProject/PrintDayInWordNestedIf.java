/**
 * Trying nested-if and switch-case statements.
 */
public class PrintDayInWordNestedIf {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int dayNumber = 7;  // Set the value of "number" here!
 
      // Using nested-if
      if (dayNumber == 0) {   // Use == for comparison
         System.out.println("Sunday");
      } else if ( dayNumber == 1 ) {
         System.out.println("Monday");
      } else if ( dayNumber == 2 ) {
         System.out.println("Tuesday");
      } else if ( dayNumber == 3 ) {
         System.out.println("Wednesday");
      } else if ( dayNumber == 4 ) {
         System.out.println("Thursday");
      } else if ( dayNumber == 5 ) {
         System.out.println("Friday");
      } else if ( dayNumber == 6 ) {
         System.out.println("Saturday");
      } else {
         System.out.println("Not a valid day");
   }
 
 }
} 