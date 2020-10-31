import java.util.Scanner;
public class P1Module7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // To create scanner
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: "); // To get user input
        double x1 = input.nextDouble(); 
        double y1 = input.nextDouble();
        Point p1 = new Point(x1,y1);
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        Point p2 = new Point(x2,y2);
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        Point p3 = new Point(x3,y3);
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        Point p4 = new Point(x4,y4);
        Point intersection = getIntersectingPoint(p1,p2,p3,p4);
        if (intersection.x == Double.MAX_VALUE && intersection.y == Double.MAX_VALUE) { // If,else for answer for user
            System.out.println("The two lines are parallel");
        } else {
            System.out.println("The intersecting point is at " + "(" + intersection.x + "," + intersection.y + ")");
            input.close(); // To close scanner
        }
    }
    public static Point getIntersectingPoint(Point p1, Point p2, Point p3, Point p4) {
        double a = (p2.y-p1.y); // Equation for intersecting point
        double b = (p1.x-p2.x);
        double c = a * (p1.x)+ b * (p1.y);
        double d = (p4.y-p3.y);
        double e = (p3.x-p4.x);
        double f = (d * (p3.x))+(e * (p3.y));
        double determinant = (a * e - d * b);
        if (determinant == 0) {
            return new Point(Double.MAX_VALUE, Double.MAX_VALUE);
        }
        else {
            double x = (e * c - b * f) / (determinant);
            double y = (a * f - d * c) / (determinant);
            return new Point(x,y);
        }   
}

public static class Point{ // Point class
double x;
double y;

Point(double x, double y){
this.x = x;
this.y = y;
}
}
}