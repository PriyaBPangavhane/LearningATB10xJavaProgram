package feb_01_Task;

import java.util.Scanner;

//Using URL.contains(".com") instead of URL.endsWith(".com") can give incorrect results.
//👉 Example: If the input is "mycompany.com.org", the program will incorrectly detect it as .com instead of .org.
//
//Fix
//✅ Use endsWith(".com") instead of contains(".com") to check if the URL actually ends with that domain type.

/*Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
:- take the Site URL input from the user
Example Scenarios
Input: example.com
Output: The website type is: Commercial website
Input: example.org
Output: The website type is: Non-profit organization
Input: example.edu
Output: The website type is: Educational institution
Input: example.gov
Output: The website type is: Government website
Input: example.net
Output: The website type is: Network-related website
Input: example.info
Output: The website type is: Informational website
Input: example.xyz
Output: The website type is: Unknown or other types of website
*/


public class websiteDomainCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website URL: ");
        String URL = sc.next();

        if (URL.endsWith(".com"))
        {
            System.out.println("The website type is: Commercial website");
        }
        else if (URL.endsWith(".org"))
        {
            System.out.println("The website type is: Non-profit organization");
        }

        else if (URL.endsWith(".edu"))
        {
            System.out.println("The website type is: Educational institution");
        }

        else if (URL.endsWith(".gov"))
        {
            System.out.println("The website type is: Government website ");
        }

        else if (URL.endsWith(".net"))
        {
            System.out.println("The website type is: Network-related website");
        }

        else if (URL.endsWith(".info"))
        {
            System.out.println("The website type is: Informational website");
        }
        else
        {
            System.out.println("The website type is: Unknown or other types of website");
        }


    }
}
