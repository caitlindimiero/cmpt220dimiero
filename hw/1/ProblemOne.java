import java.util.Scanner;
public class ProblemOne {

    
  public static void main(String[] args) {
        Scanner input.closed = new Scanner(System.in);

            System.out.print(" A: "); // To get A input from user
            double a = input.nextDouble(); 
            System.out.print(" B: "); // To get B input from user
            double b = input.nextDouble();
            System.out.print(" C: "); // To get C input from user
            double c = input.nextDouble();

            double result = b * b - 4 * a * c;

            if (result > 0) { // if, else statement to give solve for answer
                double answer1 = (-b + Math.pow(result, .5)) / (2 * a);
                double answer2 = (-b - Math.pow(result, .5)) / (2 * a);
                System.out.println("The discriminants are " + answer1 + " and " + answer2);
            } else if (result == 0) {
                double answer1 = -b / (2 * a);
                System.out.println("The discriminant is " + answer1);
            } else {
                System.out.println("There are no real discriminants for this equation.");
            }

    }
}
