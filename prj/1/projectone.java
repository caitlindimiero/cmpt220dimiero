/**
 * This project solution is exactly the same as the one submitted by another
 * student. Who came up with this solution?
 */
import java.util.Scanner;
public class projectone   {
    public static void main(String[] args)   
    {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of inputs: "); // Get user input for number of inputs
    // JA: This was not part of the inputs.

    n=sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter the input numbers: "); // Get user input for numbers
    for(int i=0; i<n; i++)
    {

    arr[i]=sc.nextInt();
    }

    int max = arr[0];
    for (int i = 1; i < arr.length; i++)
    if (arr[i] > max)
    max = arr[i];

    int[] copy = new int[arr.length];
    for (int i = 0; i < copy.length; i++) {
    copy[i] = arr[i];
    }
    // JA: Be consistent with the indenting
    // JA: Why is this hardcoded to be 12?
    for(max=12;max>=0;max--){ // Code for line going up on left side with numbers
        if(max<10) System.out.print(String.format( " %d  |",max)); // Spacing between numbers and line
        else System.out.print(String.format( " %d | " ,max));
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                System.out.print(" x "); // Printing of the x's in the histogram
                arr[i] = arr[i] -1;
                sc.close(); // To close the scanner
            }
            else System.out.print( "" );
        }
        System.out.println();
    }
    for(int k=0;k<=(arr.length)*3;k++){ // Code for the spacing on the bottom
        System.out.print( "__" ); 
        System.out.print( " " );}
        System.out.println( "  " );
        System.out.print( " " );
        for(int l=0;l<copy.length;l++){
            System.out.printf( "     %2d" ,copy[l]);
            System.out.print( " " );
        }
    }
}
