package jan19th_Task_gradeCalculator;

import java.util.Scanner;

public class GradeCalculatorWithUserInputs {
     /*Write a program that calculates and displays the letter grade for a given
     numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

    A: 90-100   score>=90 && score<=100

    B: 80-89    score>=80 && score<=89

    C: 70-79    score>=70 && score<=79

    D: 60-69    score>=60 && score<=69

    F: 0-59   score<=0 && score<=59 */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score");
        int score = sc.nextInt();
        char Grade = 'F';

        if (score >= 90 && score <= 100) {
            Grade = 'A';

        }
        else if (score >= 80 && score <= 89) {
            Grade = 'B';

        }
        else if (score >= 70 && score <= 79) {
            Grade = 'C';

        }
        else if (score >= 60 && score <= 69) {
            Grade = 'D';

        }
        else if (score >= 0 && score <= 59) {
            Grade = 'F';

        }
        else {
            System.out.println("Invalid score! Please enter a score between 0 and 100.");
        }
        System.out.println("Your Score is "+score);
        System.out.println("Your grade is "+Grade);


    }
}
