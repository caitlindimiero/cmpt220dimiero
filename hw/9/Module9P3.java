import java.util.Scanner;
import java.util.Stack;

public class Module9P3 {
    public static int bin2Dec(String binaryString) throws NumberFormatException { // bin2Dec(String binaryString header)
        int result = 0;
        int prod = 1;
        Stack<Integer> stack = new Stack<>();
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
                throw new NumberFormatException();
            }
            if (binaryString.charAt(i) == '1') {
                stack.push(prod);
            }
            prod *= 2;
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in);
        String b;
        System.out.print("Enter a binary number: "); // Get user input
        b = scanner.nextLine();
        try {
            System.out.println(bin2Dec(b));
        } catch (Exception e) {
            System.out.println("Not a binary number: " + b); // Give user answer
            scanner.close(); // To close scanner
        }

        class BinaryFormatException extends NumberFormatException { // Defining custom exception
            private static final long serialVersionUID = 1L;
            private String binaryString;

            private BinaryFormatException(String binaryString) {

                super(binaryString + " is not a binary string");
                this.binaryString = binaryString;
            }

            private String getBinaryString() {
                return binaryString;
            }
        }
    }
}

class BinaryFormatException extends NumberFormatException { // Defining custom exception
    private static final long serialVersionUID = 1L;
    private String binaryString;

    private BinaryFormatException(String binaryString) {

        super(binaryString + " is not a binary string");
        this.binaryString = binaryString;
    }

    private String getBinaryString() {
        return binaryString;
    }
}