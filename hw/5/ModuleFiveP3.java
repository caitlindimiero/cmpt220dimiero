import java.util.Scanner;
public class ModuleFiveP3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); // To input scanner
        System.out.print("Enter total seconds: "); // To get user input for total seconds
        long s = in.nextInt(); 
        System.out.println(format(s));
        in.close(); // To close in
    }
     public static String format(long seconds) // If/else to calculate the hours, minutes, and seconds for total seconds
{
    if (seconds < 0)
    {
        return "";
    }
    else
    {  
        long sec = seconds % 60;
        long hours = seconds / 60;
        long mins = hours % 60;
        hours = hours / 60;
        return String.format("The hours, minutes, and seconds for total seconds " + seconds + " is " + hours + ":" + mins + ":" + sec); // Give answer to user
    }
}
}


