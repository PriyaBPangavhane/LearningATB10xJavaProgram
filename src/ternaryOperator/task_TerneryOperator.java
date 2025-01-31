package ternaryOperator;

public class task_TerneryOperator {
    public static void main(String[] args) {
        //CLI Options
        //1.	Take a user input - Name, Age and Salary and print them in the end.

        //1. Inputs -> Name->String , Age->int, Salary ->double
        //2.Logic ->Using CLI so need to convert the String to Integer and double
        //3.Output -> Print the result

        String name = args[0];
        String age_string = args[1];
        String salary_String = args[2];
        int age = Integer.parseInt(age_string);
        double salary = Double.parseDouble(salary_String);

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }
}
