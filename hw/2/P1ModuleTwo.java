import java.util.Scanner;

public class P1ModuleTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width: "); // Get user input for width
        double width = input.nextDouble();
        System.out.println("Enter the height: "); // Get user input for height
        double height = input.nextDouble();
            input.close(); // To close scanner
        
        double perimeter = 2*(height + width); // To calculate perimeter
        double area = width * height; // To calculate area

        System.out.println("The perimeter is: "+ perimeter); // To give user an answer
        System.out.println("The area is: "+ area); // To give user an answer
        System.out.println("The length of the diagonal is: " + Math.sqrt((width*width) + (height*height))); // To give user an answer 
    }
}