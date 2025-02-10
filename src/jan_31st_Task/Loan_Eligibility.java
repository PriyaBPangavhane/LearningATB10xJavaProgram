package jan_31st_Task;

import java.util.Scanner;

public class Loan_Eligibility {
    /*Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
* Take the below User info and store it into the variables:
Age (integer)
Salary (double or float)
Credit Score (integer)
Age Validation:
:- Check if the age is a positive integer.
:- Ensure the age is at least 18 years old.
:- Max age can be 80.
Salary Validation:
:- Check if the salary is a positive number.
:- Define a minimum salary threshold (e.g., 30,000).
Credit Score Validation:
:- Check if the credit score is a positive integer.
:- Define a minimum credit score threshold (e.g., 650).
:- Max credit score threshold (e.g., 850).*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = sc.nextInt();
        System.out.println("Enter the Salary");
        double salary = sc.nextDouble();
        System.out.println("Enter the Credit Score: ");
        int creditScore = sc.nextInt();

        if (age<18 || age>80)
        {
            System.out.println("Age must be between 18 to 80");
        }

        if (salary<30000)
        {
            System.out.println("Minimum Salary required is 30,000");
        }
        if (creditScore<650 && creditScore>850)
        {
            System.out.println("Credit score required in between 650 to 850");
        }
        else
                {
                    System.out.println("Congratulations you are eligible for Loan");

                }
    }


}
