import java.util.Scanner;
public class RectangleComputation {
   public static void main(String[] args) {
      int length, width, area, perimeter;
      Scanner in = new Scanner(System.in);

      System.out.print("Enter the length: ");
      length = in.nextInt();
      System.out.print("Enter the width: ");
      width = in.nextInt();
      
      // Compute area and circumference
      area = length * width;
      perimeter = 2 * length + 2 * width;
      
      // Print results
      System.out.println("The perimeter is: " +perimeter);
      System.out.println("The area is: " +area);

      in.close();
   }

}