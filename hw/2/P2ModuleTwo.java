import java.util.Scanner;

public class P2ModuleTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ball travel time in seconds: "); // Get input from user for ball travel time
        double t = input.nextDouble();
        System.out.println("Enter the initial velocity in meters per second (m/s): "); // Get input from user for initial velocity 
        double v0 = input.nextDouble();
        System.out.println("Enter the distance traveled in meters: "); // Get input from user for distance traveled
        double a = 9.8 ;
        input.close();

        double d = ((v0*t) + (a*((t*t/2)))); // To calculate d

    
        System.out.println("The height of the building is: " + d);  // To give user an answer    
    }
}