import java.util.Scanner;
public class P1Module10 {
    public static void main(String[] args) { // Main method for print statements for Time class
        Scanner input = new Scanner(System.in); // Scanner input
        int hours, mins, secs; 
        long t; 
        System.out.print("Enter time1 (hour minute second):"); // Get user input for time1
        hours = input.nextInt();
        mins = input.nextInt();
        secs = input.nextInt();
        Time t1 = new Time(hours,mins,secs);
        System.out.println("Elapsed seconds in time1: " + t1.getSecond());
        System.out.println("Enter time2 (elapsed time): "); // Get user input for time2
        t = input.nextLong();
        Time t2 = new Time(t);
        System.out.print(t2);
        System.out.println("Elapsed seconds in time1: " + t1.getSecond());
        System.out.println("time1.compareTo(time2)? " + t1.compareTo(t2));
        Time t3 = (Time) t1.clone();
        System.out.println("time3 is created as a clone of time1 time1.compareTo(time3)? " + t1.compareTo(t3));
        input.close(); // Close scanner
    }
}