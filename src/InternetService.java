/*
Name: Gladys Daniel
Course: Introduction to Java Programming
Assignment: I (INTERNET SERVICE PROVIDER)

CLASS: This class performs all the manipulations to getPackage, getHours and getMothlyCost
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class InternetService {

    //private boolean checkTrue = false; // boolean expression for any condition that needs it
    private char checkPack;  //check for package
    private double checkHours;  //hours

    //default constructor
    public InternetService () {
    }

    public InternetService (char pack, double hours, boolean isTrue ) {

        checkPack = pack;
        checkHours = hours;
    }

    //method to get package
    public char getPackage (){
        char pack;
        boolean isTrue= false;
        Scanner sc = new Scanner(System.in);

        do  {
            System.out.print("Please select package: ");
            pack = sc.next().charAt(0);

            if (pack == 'A' || pack == 'a'){
                //System.out.println("You have selected package A");
                isTrue = false;
            }
            else if (pack == 'B' || pack == 'b'){
                isTrue = false;
            }
            else if (pack == 'C' || pack == 'c'){
                isTrue = false;
            }
            else
            {
                System.out.println("You have entered an invalid package!");
                isTrue = true;
            }
        }  while (isTrue);
        return pack;  //return package
    }

    //method to get hours
    public double getHours ()
    {
        boolean isTrue;
        double hours;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Please enter hours used: ");
            hours = sc.nextDouble();

            if (hours > 0 && hours <= 744){
                isTrue = false;
            }
            else
            {
                System.out.println("Maximum hours cannot be less than 0 or exceed 744");
                isTrue = true;
            }
        } while (isTrue);
        return hours;
    }

    //method to calculate monthly cost
    public double getMonthlyCost (char pack, double hours)
    {
        double cost = 0;

        if (pack == 'A'|| pack == 'a')
        {
            final double costPerHour = 9.95;
            final double minHour = 10;
            final double extraCost = 2;

            if (hours <= 10) {
                cost = (costPerHour * hours);
            }
            else {
                double extraHour = hours - minHour;
                cost = (extraCost * extraHour) + (costPerHour * hours);
                System.out.println("Additional cost of 2$/hr has been incurred for extra " + extraHour + " hours used!");
            }
        }

        else if (pack == 'B'|| pack == 'b')
        {
            final double costPerHour = 14.95;
            final double minHour = 20;
            final double extraCost = 1;

            if (hours <= 20) {
                cost = (costPerHour * hours);
            }
            else{
                double extraHour = hours - minHour;
                cost = (extraCost * extraHour) + (costPerHour * hours);
                System.out.println("Additional cost of 1$/hr has been incurred for extra " + extraHour + " hours used!");
            }
        }

        else if (pack == 'C'|| pack == 'c')
        {
            final double costPerHour = 19.95;
            cost = (costPerHour * hours);
        }

        return cost;
    }
}
