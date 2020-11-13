import java.util.Scanner;
public class Module9P1 {
        public static void main(String[] args) {
        int[] array = new int[100]; // 100 random integers
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        Scanner input = new Scanner(System.in); // To create scanner
        System.out.print("Enter an index for the array: "); // Get user input
        try { //Outofboundsexception execution
            int ind = input.nextInt();
            System.out.println("array[" + ind + "] = " + array[ind]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Index" + ex.getLocalizedMessage() + " is out of bounds");
        } catch (Exception ex) {
            System.out.println("Something went wrong because of input.");
            input.close(); // To close scanner
        }
    }
}
