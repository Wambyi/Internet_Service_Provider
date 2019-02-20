/*
Name: Gladys Daniel
Course: Introduction to Java Programming
Assignment: I (INTERNET SERVICE PROVIDER)

MAIN PROGRAM: This project calculates the monthly cost of the internet based on the package and hours used
 */

import java.util.Locale;
import java.text.NumberFormat;

public class isp_Main {



    public static void main (String [] args)
    {
        InternetService internetProvider = new InternetService();  // object from class 'internetProvider'

        char pack = internetProvider.getPackage();  //get package from class 'internetProvider'
        double hours = internetProvider.getHours();   //get hours from class 'internetProvider'
        double monthlyCost = internetProvider.getMonthlyCost(pack, hours);   // calculate monthly cost

        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH); // convert cost to local currency format
        String priceString = currency.format(monthlyCost); //convert monthly cost to local canadian currency
        System.out.println("Total cost for the month = " + priceString);

    }

}
