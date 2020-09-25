import java.security.SecureRandom;
import java.util.Scanner; // For Scanner
public class P4ModuleThree {
    public static void main(String[] args)
    {
        String correct[]= {
              " Excellent ", " Correct ", " Way to go " // To tell user if they did well while answering given problem
        };

        String incorrect[]= {
              " Incorrect ", " Wrong ", " Not Right " // To tell user if they did bad while answering given problem
        };
        int r;
        Scanner sc = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int n1 = rand.nextInt(10);
        int n2 = rand.nextInt(10);
        int ans = ( n1 - n2 );
        System.out.println( " What is " + n1 + " - " + n2 + " ? "); // To ask user for answer input

       while (true) {
          System.out.print( " Answer: " ); // To print answer to user
          int user = sc.nextInt();

        if ( user == ans ) { // To tell user answer is correct if input is correct
           System.out.println();
           r=(int)(rand.nextInt(3));
           System.out.println(correct[r]);

               break;
           }

           System.out.println();
           r=(int)(rand.nextInt(3));
           System.out.println(incorrect[r]);
           System.out.println( " The correct answer is " + ans + "" ); // To give user right answer if they give the wrong answer
       }
       sc.close();
   }

}


