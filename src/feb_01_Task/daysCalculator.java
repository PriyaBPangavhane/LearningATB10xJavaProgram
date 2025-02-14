package feb_01_Task;

import java.util.Scanner;
/*Convert Days into Years, Months, and Days.
:- Take the Days Input from the User
Define the conversion logic:
:- Assume 1 year = 365 days.
:- Assume 1 month = 30 days
:- Convert the Days into Years, Month and days and Print it.
if you input 1000 days, the output of the program would be: 2 years, 9 months, and 0 days.
*/

public class daysCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days: ");
        int totaldays =sc.nextInt();

        int years = totaldays/365;
        int remainingDays = totaldays%365;

        int months = remainingDays/30;
        int days = remainingDays%30;

        System.out.println(years +"Years,"+months+ "Months,"+days+ "Days");

    }
}
