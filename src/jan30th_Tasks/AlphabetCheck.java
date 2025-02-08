package jan30th_Tasks;

import java.util.Scanner;

public class AlphabetCheck {
    //Check if a Character is an Alphabet.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);

        if(Character.isLetter(ch))
        {
            System.out.println("Character is an alphabet");
        }
        else
        {
            System.out.println("Character is not an alphabet");
        }
    }
}
