import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class P1Module8 {

    public static ArrayList<String> split(String s, String delimiters){ // Header
        // These are individual delimiters
        return new ArrayList<String> (Arrays.asList(s.split(delimiters)));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // To input scanner
        System.out.println("Enter a string: "); // To get user input for string
        String s = input.nextLine();
        System.out.println("Enter the delimiters: "); // To get user input for delimiters
        String delimiters = input.nextLine();
        System.out.println(split(s,delimiters)); 
        input.close(); // To close scanner
    }
}


