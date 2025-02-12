package jan_31st_Task;

import java.util.Scanner;

/*) Calculate Bonus Based on Salary and Years of Experience.
:- take the salary and Year info from the User.
Implement Bonus Calculation Logic:
Define the bonus structure based on salary and years of experience.
:- If years of experience is less than 1 year: No bonus.
:- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
:- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
:- If years of experience is greater than 6 years: Bonus is 15% of the salary.
*/
public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary");
        double salary = sc.nextDouble();
        System.out.println("ENter the year of experience: ");
        float yearOfExperience =sc.nextFloat();
        double bonus = 0;

        if (yearOfExperience<1)
        {
            System.out.println("No Bonus");
        } else if (yearOfExperience>1 && yearOfExperience<=3)
        {
            bonus = 0.05*salary;
            System.out.println("Bonus is: Rs."+bonus);
        }

        else if (yearOfExperience>3 && yearOfExperience<=6)
        {
            bonus = salary*0.10;
            System.out.println("Bonus is: Rs."+bonus);
        }

        else if (yearOfExperience>6)
        {
            bonus = salary*0.15;
            System.out.println("Bonus is: Rs."+bonus);
        }
    }
}
