import java.util.Scanner;
public class ModuleFiveP2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // To input scanner
        System.out.print("Enter a string: "); // To get user input for string
        String s = in.nextLine();
        System.out.println(s);
        String upper_case_s = ""; 
          Scanner sScan = new Scanner(s); 
            while(sScan.hasNext()) {
                String word = sScan.next(); 
                upper_case_s += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; // For capitalization of string
            }
         System.out.println("The new string is: " + upper_case_s.trim()); // To print new uppercase string for user
         sScan.close(); // To close scanner
         in.close(); // To close in
       }
   }
