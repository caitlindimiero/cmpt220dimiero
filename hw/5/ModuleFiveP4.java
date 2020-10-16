import java.util.Scanner;
public class ModuleFiveP4 {
    public static void main(String[] args){
        System.out.println("Enter the number of rows:"); // Get user input for number of rows
        Scanner in = new Scanner(System.in); { 
        int rows = in.nextInt(); 
        PascalTriangle(rows); 
        in.close(); // To close in
    } 
} 
        public static void PascalTriangle(int rows) { // To create pascal triangle
            for (int i = 0; i < rows; i++) { 
            int number = 1; 
            System.out.printf("%" + (rows - i) * 2 + "s", ""); 
            for (int j = 0; j <= i; j++) 
            { 
                System.out.printf("%4d", number); 
                number = number * (i - j) / (j + 1); }
                System.out.println(); // To print pascal triangle for user 
            } 
        }
         
    }


