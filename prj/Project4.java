import java.util.Scanner;
public class Project4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); // Scanner for user input
    System.out.print("Enter the first complex number: "); // Get first complex number from user
    Complex complexnum1 = new Complex(in.nextDouble(), in.nextDouble());
    System.out.print("Enter the second complex number: "); // Get second complex number from user
    Complex complexnum2 = new Complex(in.nextDouble(), in.nextDouble());
    System.out.println("(" + complexnum1 + ") + (" + complexnum2 + ") = " + complexnum1.add(complexnum2)); // Display answers to user 
    System.out.println("(" + complexnum1 + ") - (" + complexnum2 + ") = " + complexnum1.subtract(complexnum2));
    System.out.println("(" + complexnum1 + ") * (" + complexnum2 + ") = " + complexnum1.multiply(complexnum2));
    System.out.println("(" + complexnum1 + ") / (" + complexnum2 + ") = " + complexnum1.divide(complexnum2));
    System.out.println("|" + complexnum1 + "| = " + complexnum1.abs());
    in.close(); // Close scanner
  }
}
        
    
    