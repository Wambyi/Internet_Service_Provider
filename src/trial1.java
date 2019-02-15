/*Program to calculate customer's monthly bill
* Ask customer for package purchased;
* Hours used
* Display total amount due
* */

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class trial1 {

    public static void main (String [] args)
    {
        //make variables to be class variables (define at the begining of class) AND 'PRIVATE'
        //put in a new class

        //Number format for currency
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);


        String package_sc;   //package a, b and c CAN ONLY BE SELECTED
        double totalHours = 744; //in a month cannot exceed 744
        double numberHours;   //number of hours - hours part of the package (never less than zero)
        double monthlyCost;

        Scanner sc = new Scanner(System.in);

        //prompts user to enter a character - still need work
        System.out.print("Please select package (A , B, C): ");
        package_sc = sc.next();


        if (package_sc == "A")
        {
            System.out.println("Package A selected");
        }
        else if (package_sc == "B")
        {
            System.out.println("Package A selected");
        }
        else if (package_sc == "C")
        {
            System.out.println("Package A selected");
        }

        System.out.print("Please enter hours worked: ");
        numberHours = sc.nextDouble();

        //not necessary.... worth a trial
        if (numberHours > totalHours)
        {
            System.out.print("Total hours cannot be over 744 hrs in a month, please enter a valid hour: ");
            numberHours = sc.nextDouble();
        }


        //Monthly hours calculation (put into a METHOD) - call function for each calc.
        double pack = 9.95;  //per month
        monthlyCost = pack * totalHours;
        String priceString = currency.format(monthlyCost);   //add currency sign
        System.out.println("Monthly cost: " + priceString);


        //package A
        if (numberHours > 10){
            double extraHour = 2;
            monthlyCost = extraHour * pack * totalHours;
            String price2String = currency.format(monthlyCost);
            System.out.println("Monthly bill: " + price2String);
        }


    }

    //Methods other than constructor, perform and main must also be declared as private

    //input method
//    public double getInput (double value)
//    {
//
//    }
//
//    public double regularMonthlyCharge (double value)
//    {
//
//    }
//
//    public double displayResult (double value)
//    {
//
//    }
}
