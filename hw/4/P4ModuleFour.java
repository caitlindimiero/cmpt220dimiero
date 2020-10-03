import java.util.Scanner;
public class P4ModuleFour { 
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter a positive integer: "); // Get user input for positive integer
    int num = sc.nextInt();
    int inside_root = num;
    int outside_root = 1;
    int d = 2;
    while(d*d<=inside_root){
     if(inside_root%(d*d)==0){
       inside_root = inside_root/(d*d);
       outside_root = outside_root * d;
      }
      else
        d+=1;
     }
     {
      Scanner input = new Scanner(System.in); // To program for perfect square
      System.out.println(Math.sqrt(num));
      System.out.print( "sqrt ("+num+ ") is " + (Math.sqrt(num)));
      input.close();
     }
    if(outside_root!=1 && inside_root!=1)
      System.out.println("sqrt("+num+") is "+outside_root+"*sqrt("+inside_root+")");
    if(inside_root!=1 && outside_root!=1)
      System.out.println("sqrt("+num+") is "+outside_root);
    if(inside_root!=1 && outside_root==1)
      System.out.println("sqrt("+num+") is " +"sqrt("+inside_root+")");
    if(inside_root==1 && outside_root==1)
      System.out.println("sqrt("+num+") is " +1);
      sc.close(); // To close scanner
 }
}

        
        