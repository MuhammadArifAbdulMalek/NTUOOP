import java.util.Scanner;
public class CircleComputation {  // Save as "CircleComputation.java"
   public static void main(String[] args) {

      double radius, area, circumference, diameter;
      Scanner in = new Scanner(System.in);

      System.out.print("Enter the radius: ");
      radius = in.nextDouble();
      
      area = Math.PI * radius * radius;
      diameter = 2.0 * radius;
      circumference = 2.0 * Math.PI * radius;
      
      System.out.printf("Diameter is: %.2f%n", diameter);
      System.out.printf("Circumference is: %.2f%n", circumference);
      System.out.printf("Area is: %.2f%n", area);
   }
}