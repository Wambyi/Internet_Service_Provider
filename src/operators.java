/* CLASS FOR OPERATORS
*
* */
import java.util.Scanner;

public class operators {

    //variables (Strings and integers
    //e.g Private int age = 10;
    Scanner sc = new Scanner(System.in);

    // Method

    public void selectPack()
    {
        System.out.print("Please select package: ");
        char pack = sc.next().charAt(0);
        String packageName = " ";

        switch (pack)
        {

            case 'A':
                packageName = "A";
                //packA(hrs);
                break;

            case 'B':
                packageName = "B";
                //packB(hrs);
                break;

            case 'C':
                packageName = "C";
                //packC(hrs);
                break;

            default:
                packageName = "an invalid package";
        }

        System.out.println("You have selected package " + packageName);
    }

    //get hours used
    public void getHours()
    {
        System.out.print("Please enter hour used: ");
        double hrs = sc.nextDouble();

    }

    //calculate packages --- PUT INTO ONE LOOP
    public static void packA (double hours)
    {
        double costPerHour = 9.95;

        if (hours <= 10)
            System.out.println("Total cost = $ " + (costPerHour * hours));
        else
            System.out.println("Total cost + extra = $ " + (costPerHour * hours * 2));
    }

    public static void packB (double hours)
    {
        double costPerHour = 14.95;

        if (hours <= 20)
            System.out.println("Total cost = $ " + (costPerHour * hours));
        else
            System.out.println("Total cost + extra = $ " + (costPerHour * hours * 1));  //problem here (1$ per extra hour)
    }

    public static void packC (double hours)
    {
        double costPerHour = 19.95;
        System.out.println("Total cost = $ " + (costPerHour * hours));
    }


}
