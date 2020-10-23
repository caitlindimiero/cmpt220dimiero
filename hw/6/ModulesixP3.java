import java.util.Scanner;
import java.util.Arrays;
public class ModulesixP3 {

        public static void main(String[] args) { // public static boolean isAnagram(String s1, String s2)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string:"); // Get user input for first string
        String s1 = input.next();
        System.out.println("Enter the second string:"); // Get user input for second string
        String s2 = input.next();
        input.close(); // To close scanner

            if(s1.length() == s2.length()) { // Arrays to check for anagrams
              char[] charArray1 = s1.toCharArray();
              char[] charArray2 = s2.toCharArray();
              Arrays.sort(charArray1);
              Arrays.sort(charArray2);
              boolean result = Arrays.equals(charArray1, charArray2);
        
              if(result) { // To give answer to user for anagram or not an anagram
                System.out.println(s1 + " and " + s2 + " are anagram.");
              }
              else {
                System.out.println(s1 + " and " + s2 + " are not anagram.");
              }
            }
        }
    }