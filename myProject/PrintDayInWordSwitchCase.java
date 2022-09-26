public class PrintDayInWordSwitchCase {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int dayNumber = 6;  // Set the value of "number" here!
      switch(dayNumber) {
         case 0: 
            System.out.println("Sunday"); break;  // Don't forget the "break" after each case!
         case 1: 
            System.out.println("Monday"); break;
         case 2: 
            System.out.println("Tuesday"); break;
         case 3: 
            System.out.println("Wednesday"); break;
         case 4: 
            System.out.println("Thursday"); break;
         case 5: 
            System.out.println("Friday"); break;
         case 6: 
            System.out.println("Saturday"); break;
         default: System.out.println("Not a valid day"); 
      }
   }
}