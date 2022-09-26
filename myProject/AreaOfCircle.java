/** Compute area of a circle given radius */
public class AreaOfCircle {
	
	public static void main(String[] args) {
		
		double radius; // floating point numbers
		double area;
		
		// Assign a value to radius
		radius = 10.0;

		// Compute area of circle
		area = radius * radius * 3.1416;

		// Print result
	System.out.println("The area for the circle of radius " + radius + " is " + area);
	}
}