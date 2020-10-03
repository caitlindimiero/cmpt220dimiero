import java.util.Scanner;
public class P1ModuleFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //To get user input from the following print options
        System.out.println(" Main menu ");
        System.out.println(" 1:Addition ");
        System.out.println(" 2:Subtraction ");
        System.out.println(" 3:Multiplication ");
        System.out.println(" 4:Division ");
        System.out.println(" 5:Exit ");
        int userChoice = 0;
        System.out.println(" Enter a choice: ");
        userChoice = input.nextInt();
        while (userChoice != 5) {
            int firstNum = (int)(Math.random() * 10);
            int secondNum = (int)(Math.random() * 10);
            switch (userChoice) {
                
        
        case 1: // If user picks addition
            int adding = firstNum + secondNum;
            System.out.println(firstNum + " + " + secondNum+" ? ");
            int addingInput = input.nextInt();
        if (addingInput == adding)
        System.out.println(" correct ");
        else
        System.out.println("Your answer is wrong. The correct answer is " + adding);
break;

        case 2: //If user picks subtraction
            int sub = firstNum - secondNum;
            System.out.println(firstNum + " - " + secondNum + " ? " );
            int subInput = input.nextInt();
        if (subInput == sub)
        System.out.println(" correct ");
        else
        System.out.println(" Your answer is wrong. The correct answer is " + sub);
break;

        case 3: // If user picks multiplication
            int mult = firstNum * secondNum;
            System.out.println(firstNum + " * " + secondNum + " ? " );
            int multInput = input.nextInt();
        if (multInput == mult)
        System.out.println(" correct ");
        else
        System.out.println(" Your answer is wrong. The correct answer is " + mult);
break;

        case 4: // If user picks division
            while (secondNum == 0){
            secondNum = (int)Math.round((Math.random()*10));
};

        double div = firstNum / secondNum;
        System.out.println(firstNum + " / " + secondNum + " ? ");
        double divInput = input.nextDouble();
        if (divInput == div)
        System.out.println(" correct ");
        else
        System.out.println(" Your answer is wrong. The correct answer is " + div);
break;

        case 5: // If user picks to exit
        System.exit(0); 
        input.close();
break;

        default:
        System.out.println(" Error: Out of range ");
        System.exit(0);
}

    System.out.println(" Enter a choice: ");
    userChoice = input.nextInt();
        }
    }
}
