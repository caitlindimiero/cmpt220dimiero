import java.util.Scanner;
public class ModulesixP2 {
    public static int[] count(String s) { // To input method header
		int[] counts = new int[400]; // Code for counting number of digits
		for(int i = 0; i < s.length(); ++i) {
			if(Character.isDigit(s.charAt(i))) {
				counts[s.charAt(i)-'0']++;
			}
		}
		return counts;
	}
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in); // To input scanner for user input
			System.out.print("Enter a string: "); // To get user input
			String line = in.nextLine();
			int[] counts = count(line);
			in.close(); // To close scanner
			for (int i = 0; i < counts.length; ++i) {
				if(counts[i] != 0) {
					System.out.printf("Digits %d occurs %d times\n", i, counts[i]); // To give user answer
				}
			}
		}
	}
