import java.util.Scanner;
public class ProblemTwo {
    public static void main(String[] args) {
        double initialVelocity, finalVelocity,timeSpan; // variables to read data from user
        Scanner sc = new Scanner(System.in); // JA: ?
        System.out.println("\nEnter Initial velocity in m/s:");
        initialVelocity=sc.nextDouble(); // To read the initialVelocity

        System.out.println("\nEnter final velocity in m/s:");
        finalVelocity=sc.nextDouble(); // To read time

        double result = (finalVelocity-initialVelocity)/ timeSpan; // To calculate Average Acceleration. JA: Where is timeSpan set?
        System.out.println("\n The calculated Average Acceleration is:" + result);
    }
}

          