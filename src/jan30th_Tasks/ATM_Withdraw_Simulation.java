package jan30th_Tasks;

import java.util.Scanner;

public class ATM_Withdraw_Simulation {
    /*ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
    Steps to Write the Program
1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
2️⃣ Take user input for the amount they want to withdraw.
3️⃣ Check withdrawal conditions:
•	The amount should be greater than zero.
•	The amount should be a multiple of 100 (common ATM rule).
•	The amount should not exceed the account balance.
4️. Deduct the amount from the balance if conditions are met.
5️. Display the updated balance or an error message if the withdrawal fails.*/

    public static void main(String[] args) {
        double AccountBalance = 10000d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the withdrawl Amount: ");
        double wamount = sc.nextDouble();

        if (wamount>0 && wamount%100==0 && wamount<AccountBalance)
        {
            AccountBalance=AccountBalance - wamount;
            System.out.println("Account Balance is : "+AccountBalance);
        }
        else
        {
            System.out.println("Error: Insufficient funds. Available balance");
        }

    }

}
