import java.util.Scanner;
public class Project2 {
 
 public static void main(String[] args) { 
    Scanner in = new Scanner(System.in); // To input scanner
    System.out.print("Input amount for your investment: "); // Get user input for investment amount
 	double investment = in.nextDouble();
 	System.out.print("Input your rate of interest(not decimal form): "); // Get user input for interest rate
	double rate = in.nextDouble();
	System.out.print("Input your number of years: "); // Get user input for number of years
	int numyear = in.nextInt();
	in.close(); // To close scanner
	rate *= 0.01;
	System.out.println("Years    FutureValue"); // Printing of the correct format for the code & execution of formula
	for(int i = 1; i <= numyear; i++) {
    	int formatter = 19;
	    if (i >= 10) formatter = 18;
		System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate/12, i));
       }
	 }
    public static double futureInvestmentValue(double investmentAmount,
											   double monthlyInterestRate,
											   int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}

