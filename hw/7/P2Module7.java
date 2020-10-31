import java.util.Scanner;
public class P2Module7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // To create scanner
        System.out.print("Enter x1, y1, x2, y2, x3, y3: "); // To get user input
        double x1 = input.nextDouble(); 
        double y1 = input.nextDouble();
        Point p1 = new Point(x1,y1);
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        Point p2 = new Point(x2,y2);
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        Point p3 = new Point(x3,y3);
        Point intersection = getCenterPoint(p1,p2,p3);
            System.out.println("The center point is at " + "(" + intersection.x + "," + intersection.y + ")"); // To give user answer
            input.close(); // To close scanner
        }
    public static Point getCenterPoint(Point p1, Point p2, Point p3) { // Solving with equation
        double a = (p1.x + p2.x + p3.x);
        double b = (p1.y + p2.y + p3.y);
            double x = a / 3;
            double y = b / 3;
            return new Point(x,y);
        }   
}
class Point{ // Point class
double x;
double y;

Point(double x, double y){
this.x = x;
this.y = y;
}
}

