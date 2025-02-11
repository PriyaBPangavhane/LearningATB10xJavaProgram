package jan_31st_Task;

import java.util.Scanner;

public class Electricity_Bill {
    /* Electricity Bill Calculation (Based on Units Consumed)
:- take the input from the user of Units.
Implement Rate Structure:
Define the rate structure for calculating the bill based on the number of units consumed.
:- First 100 units: 0.50Rs per unit
:- Next 100 units (101-200): 0.75Rs per unit
:- Next 100 units (201-300): 1.20Rs per unit
:- Above 300 units: 1.50Rs per unit */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Units: ");
        int units = sc.nextInt();
        double Bill =0;

        if (units<=100)
        {
            Bill = units*0.50;
            System.out.println("Your bill is:RS. "+Bill);
        }
        else if (units>100 && units<=200)
        {
            Bill = (100*0.50)+ ((units - 100)*0.75);
            System.out.println("Your Bill is:Rs."+Bill);
        } else if (units>200 && units<=300)
        {
            Bill = (100 * 0.50) + (100 * 0.75) + ((units - 200) * 1.20);
            System.out.println("Your Bill is:Rs."+Bill);
        } else if (units>300)
        {
            Bill = (100 * 0.50) + (100 * 0.75)+(100*1.20) + ((units - 300) * 1.50);
            System.out.println("Your Bill is:Rs."+Bill);
        }


    }

}
