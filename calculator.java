import java.util.*;

public class calculator 
{
    static Scanner input = new Scanner(System.in);

    static Scanner input2 = new Scanner(System.in);

    static public void main(String[] args)
    {
            start();
    }

    //Starts the program
    static public void start()
    {
        System.out.println("Enter 1-4: ");
        System.out.println("| 1 = + | 2 = - | 3 = * | 4 = / |");

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
}
