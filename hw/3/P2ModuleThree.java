import java.util.Scanner;
public class P2ModuleThree{
    public static void main(String args[]){
        double x1, y1, x2, y2, m ,b;
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter first coordinates: "); // To get user input for first coordinates
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.print( "Enter second coordinates: "); // To get user input for second coordinates
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        input.close(); // To close scanner
        m = ((y2 - y1) / (x2 - x1));
        b = ((y1 - ((m)*(x1)))); // Equation for slope

        System.out.print(" y= "); 
        if (m != 1) {
            System.out.print(m);
        }
        System.out.print(" x ");
        if (b != 0) {
            System.out.print(" + " + b); // To give user y= mx + b answer
        }
        System.out.print( "\n" );
        return ;
    }
}