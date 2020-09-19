import java.util.Scanner;

public class P4ModuleTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1: "); // To get input from user for x1
        double x1 = input.nextDouble();
        System.out.println("Enter x2: "); // To get input from user for x2
        double x2 = input.nextDouble();
        System.out.println("Enter y1: "); // To get input from user for y1
        double y1 = input.nextDouble();
        System.out.println("Enter y2: "); // To get input from user for y2
        double y2 = input.nextDouble();
        input.close(); // To close scanner
        
        
        


        double Slopeequation = ( (y2-y1) / (x2-x1)); // To calculate slope

        
        System.out.println("The slope for the line that connects two points is: " + Slopeequation); // To give user an answer
    }
}