package jan19th_Task_gradeCalculator;

public class GradeCalculator {

    /*Write a program that calculates and displays the letter grade for a given
     numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

    A: 90-100   score>=90 && score<=100

    B: 80-89    score>=80 && score<=89

    C: 70-79    score>=70 && score<=79

    D: 60-69    score>=60 && score<=69

    F: 0-59   score<=0 && score<=59 */

    public static void main(String[] args) {

        int score =47;
        char Grade ='A';

        if(score>=90 && score<=100)
        {
            System.out.println("Grade is A");
        } else if (score>=80 && score<=89)
        {
            System.out.println("Grade is B");

        } else if (score>=70 && score<=79)

        {
            System.out.println("Grade is C");
        }
        else if (score>=60 && score<=69)

        {
            System.out.println("Grade is D");
        }
        else if (score>=0 && score<=59)

        {
            System.out.println("Grade is F");
        }
        else {
            System.out.println("Invalid score! Please enter a score between 0 and 100.");
        }

    }


}
