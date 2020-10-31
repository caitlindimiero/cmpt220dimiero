import java.util.Scanner;
public class P3Module7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // To create scanner
		System.out.print("Enter x1, y1, x2, y2, x3, y3: "); // To get user input
		double x1 = input.nextDouble(); // Defining of variables
		double y1 = input.nextDouble();
		Point p1 = new Point(x1,y1);
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		Point p2 = new Point(x2,y2);
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		Point p3 = new Point(x3,y3);

		double area = getTriangleArea(p1,p2,p3);
		if (area < 0){ 
		System.out.println("The three points are on the same line"); // To give user answer
		}
		else {
			System.out.println("The area of the triangle is: " + area); } // To give user answer
		input.close(); // To close scanner
	}

	public static double getTriangleArea(Point p1, Point p2, Point p3) { // Header
		double s1 = Math.pow(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2), .5); // Equation for triangle area
		double s2 = Math.pow(Math.pow(p3.getX() - p2.getX(), 2) + Math.pow(p3.getY() - p2.getY() , 2), .5);
		double s3 = Math.pow(Math.pow(p1.getX() - p3.getX(), 2) + Math.pow(p1.getY() - p3.getY(), 2), .5);
		if (s1 >= s2 + s3 || s2 >= s1 + s3 || s3 >= s1 + s2)
			return -1;
		double s = (s1 + s2 + s3) / 2;
		double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		return area;
	}



}
class Point{ // Private Point class
	private double x;
	private double y;

	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
}
}



      