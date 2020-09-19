import java.util.Scanner;

public class P3ModuleTwo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the friction force in Newtons:"); // Get input from user for friction force 
        double F = input.nextDouble();
        System.out.println("Enter the object's mass in kg:"); // Get input from user for object's mass 
        double m = input.nextDouble();
        System.out.println("Enter the object's acceleration in m/s^2:"); // Get input from user for object's acceleration 
        double a = input.nextDouble();
        double g = 9.8 ; // Establish constant for g
        input.close(); // To close scanner

        double friction = ((F - (m*a))/(m*g)); // To calculate friction

       
        System.out.println("The coefficient for friction is: " + friction); // To give user an answer
    }
}