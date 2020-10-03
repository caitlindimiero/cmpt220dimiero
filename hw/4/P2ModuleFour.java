import java.util.Scanner;

public class P2ModuleFour {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in); // To input scanner
    System.out.print("Enter the number of sides: "); // Get user input for number of sides
    int sides = input.nextInt();

    System.out.print("Enter the radius of the bounding circle: "); // Get user input for radius of the bounding circle
    double radius = input.nextDouble();
    input.close();

    System.out.println("The coordinates of the points on the polygon are"); // Print to user coordinates
    for (int i = 0; i < sides; i++) {

        double x = radius * java.lang.Math.sin(2.0 * java.lang.Math.PI / sides * i);
        double y = radius * java.lang.Math.cos(2.0 * java.lang.Math.PI / sides * i);
        System.out.print("(");
        System.out.printf("%.2f,", y);
        System.out.print(" ");
        System.out.printf("%.2f", x);
        System.out.print(")");
        System.out.println();
        }
    }
}