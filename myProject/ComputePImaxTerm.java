public class ComputePImaxTerm {   
   public static void main (String[] args) {
      double sum = 0.0;
      int maxTerm = 10000;  
      double piPercentage;
      for (int term = 1; term <= maxTerm; term++) {
         if (term % 2 == 1) {
            sum += 1.0 / (term * 2 - 1);
         } else {
            sum -= 1.0 / (term * 2 - 1);         
         }
      }
      System.out.println("The value of pi is " + 4*sum);
      System.out.println("The real value of pi is " +Math.PI);

      System.out.println("The percentage of accuracy is up to " + (4*sum / Math.PI)*100 );
   }


}
