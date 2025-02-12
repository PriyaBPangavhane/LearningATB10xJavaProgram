package jan_31st_Task;
/*Find if a Person Can Travel Based on Visa Status and Age.
take the input from the user for
Age (integer).
Visa Status (String or boolean).
Check Eligibility:
:- If age is 18 or older and visa status is valid, the person can travel.
Otherwise, the person cannot travel.
Validation Criteria
Age: - Must be a non-negative integer.
:- Should be greater than or equal to 18 to be eligible to travel.
Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
:- You can also use a boolean where true indicates a valid visa and false
*/

import javax.xml.validation.Validator;
import java.util.Scanner;

public class Travel_Eligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Visa Status: ");
        boolean VisaStatus = sc.hasNextBoolean();

        if(age>18 && VisaStatus== true)
        {
            System.out.println("Eligible to Travel");
        }
        else {
            System.out.println("not eligible to Travel");
        }
    }
}
