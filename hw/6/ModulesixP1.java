import java.util.Scanner;
import java.util.ArrayList;
public class ModulesixP1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double area = CPArea(input);
    System.out.println("The area is " + area); // To give user answer for area of convex polygon
  }
  public static double CPArea(Scanner input) { // For area equation and computing of equation
    ArrayList<ArrayList<Double>> points = getPoints(input);
    double sumOfProducts = 0.0;
    for (int i = 0; i < points.size() - 1; i++) {
      double x1 = points.get(i).get(0);
      double y1 = points.get(i).get(1);
      double x2 = points.get(i + 1).get(0);
      double y2 = points.get(i + 1).get(1);
      sumOfProducts += ((x1 * y2) - (y1 * x2));
    }
    return Math.abs(sumOfProducts / 2);
  }
  public static ArrayList<ArrayList<Double>> getPoints(Scanner input) {
    System.out.print("Enter the number of end points of the convex polygon: "); // To get user input for number of end points
    int size = input.nextInt();
    System.out.print("Enter the points one by one: "); // To get user input for points
    ArrayList<ArrayList<Double>> points = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      ArrayList<Double> point = new ArrayList<>();
      point.add(input.nextDouble());
      point.add(input.nextDouble());
      points.add(point);
    }
    return points;
  }
  public static void showPoints(ArrayList<ArrayList<Double>> points) {
    for (int i = 0; i < points.size(); i++) {
      for (int j = 0; j < points.get(i).size(); j++) {
        System.out.print(points.get(i).get(j) + " ");
      }
      System.out.println();
    }
  }
}