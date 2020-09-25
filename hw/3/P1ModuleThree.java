import java.util.Scanner;
public class P1ModuleThree {
public static void main(String args[])
{
    Scanner input = new Scanner(System.in);
    double numerator,denominator,wholeNumber;
    System.out.print("Enter numerator: "); // To get numerator from user
    numerator = input.nextInt();
    System.out.print("Enter denominator: "); // To get denominator from user
    denominator = input.nextInt();
    input.close(); // To close scanner

    if(numerator<denominator)
{
    System.out.println( numerator + " / " + denominator + " is a proper fraction" ); // To give user answer of proper fraction
}
if(numerator%denominator==0)
{
    double div = numerator/denominator; // To give user answer of improper fraction and its reduction
    System.out.println(numerator + " / " + denominator + " is an improper fraction and it can be reduced to " + div ); 
}
else
{

    System.out.print(numerator + " / " + denominator); 
    wholeNumber = numerator/denominator;
    numerator = numerator%denominator;
    System.out.println(" is an improper fraction and its mixed fraction is " + wholeNumber + " + " + numerator +" / " + denominator);
// To give user answer of improper fraction and its mixed fraction
        }
    }
}