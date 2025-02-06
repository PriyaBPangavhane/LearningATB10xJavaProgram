package jan25th_ifelse_Task;

import java.util.Scanner;

public class CharVowelConsonant {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Character: ");
        int ch = sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("Letter is the vowel");
        } else if (Character.isLetter(ch))
        {
            System.out.println("Letter is consonant");
        }
        else
        {
            System.out.println("Please provide valid input");
        }
    }
}
