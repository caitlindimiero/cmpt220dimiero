import java.util.Scanner;
public class ModuleFiveP1 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); // Input scanner
        System.out.println("Enter an integer: "); // To get input from user for integer
		int value = input.nextInt();
                System.out.println("The binary value is " + decimalToBinary(value)); // To print binary value of integer
                    input.close(); // To close scanner
            }
            public static String decimalToBinary(int value) { // To get binary from the input
                String result = "";
                return decimalToBinary(value, result);
            }
            public static String decimalToBinary(int value, String result) {
                if (value / 2 == 0) 
                    return (value % 2) + result;
                else
                    return decimalToBinary(value / 2, (value % 2) + result);
            }
        }