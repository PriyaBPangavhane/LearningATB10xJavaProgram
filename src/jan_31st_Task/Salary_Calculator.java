package jan_31st_Task;
/*calculate an employee's net salary based on Basic Pay, HRA (House Rent Allowance),
 DA (Dearness Allowance), and Tax Deductions.

Salary Components
Basic Pay → Given by the user.
HRA (House Rent Allowance) → 20% of Basic Pay.
DA (Dearness Allowance) → 50% of Basic Pay.
Gross Salary = Basic Pay + HRA + DA.
Tax Deduction:
10% tax if Gross Salary > ₹50,000.
5% tax if Gross Salary is between ₹30,000 - ₹50,000.
No tax if Gross Salary ≤ ₹30,000.
Net Salary = Gross Salary - Tax Deduction.*/

import java.util.Scanner;

public class Salary_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Basic Salary");
        double BasicPay = sc.nextDouble();
        double HRA = 0.20*BasicPay;
        double DA = 0.50*BasicPay;
        double GrossSalary = BasicPay + HRA + DA;
        double TaxDeduction = 0;
        double netSalary =0;

        if (GrossSalary>50000)
        {
            TaxDeduction = 0.10*GrossSalary -TaxDeduction;
        }

        else if (GrossSalary<50000 && GrossSalary>30000)
        {

            TaxDeduction = 0.05*GrossSalary -TaxDeduction;

        }
        else
        {
          TaxDeduction = 0;

        }
        netSalary=GrossSalary-TaxDeduction;
        System.out.println("******Salary Breakdown******");
        System.out.println("BasicPay: "+BasicPay);
        System.out.println("HRA(20%): "+HRA);
        System.out.println("DA(10%): "+DA);
        System.out.println("Gross Salary: "+GrossSalary);
        System.out.println("Tax Deduction: "+TaxDeduction);
        System.out.println("Net Salary: "+netSalary);
        }

    }

