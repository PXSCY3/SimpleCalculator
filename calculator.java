import java.util.*;

public class calculator 
{
    static Scanner input = new Scanner(System.in);

    static Scanner input2 = new Scanner(System.in);

    static Scanner input3 = new Scanner(System.in);

    static public void main(String[] args)
    {
            start();
    }

    //Starts the program
    static public void start()
    {
        System.out.println("Enter 1-4: ");
        System.out.println("| 1 = + | 2 = - | 3 = * | 4 = / | 5 = % | 6 = sqrt");

        int expression = input.nextInt();

        switch(expression)
        {
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                divistion();
                break;
            case 5:
                percentage();
                break;
            case 6:
                sqrt();
                break;
        }
    }

    static public void addition()
    {
        System.out.println("Enter 1st number: ");
        double num1 = input2.nextDouble();

        System.out.println("Enter 2nd number: ");
        double num2 = input2.nextDouble();

        double sum = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
    }

    static public void subtraction()
    {
        System.out.println("Enter 1st number: ");
        double num1 = input2.nextDouble();

        System.out.println("Enter 2nd number: ");
        double num2 = input2.nextDouble();

        double sum = num1 - num2;

        System.out.println(num1 + " - " + num2 + " = " + sum);
    }

    static public void multiplication()
    {
        System.out.println("Enter 1st number: ");
        double num1 = input2.nextDouble();

        System.out.println("Enter 2nd number: ");
        double num2 = input2.nextDouble();

        double sum = num1 * num2;

        System.out.println(num1 + " * " + num2 + " = " + sum);
    }

    static public void divistion()
    {
        System.out.println("Enter 1st number: ");
        double num1 = input2.nextDouble();

        System.out.println("Enter 2nd number: ");
        double num2 = input2.nextDouble();

        double sum = num1 / num2;

        System.out.println(num1 + " / " + num2 + " = " + sum);
    }

    static public void percentage()
    {
        System.out.print("Enter 1st number (Total points): ");
        double num1 = input3.nextDouble();

        System.out.print("How much % of " + num1 + " (Points you got) : ");
        double num2 = input3.nextDouble();

        double sum = (num2 / num1) * 100;

        System.out.println(num2 + " of " + num1 + " = " + (Math.round(sum*10))/10 + "%");
    }

    static public void sqrt()
    {
        System.out.println("Enter 1st number: ");
        double num1 = input.nextDouble();

        System.out.println(num1 + " square rooted = " + (Math.sqrt(num1)));
    }
}
