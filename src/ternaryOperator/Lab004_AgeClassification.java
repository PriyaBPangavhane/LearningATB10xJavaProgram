package ternaryOperator;

public class Lab004_AgeClassification {
    public static void main(String[] args) {
        String age_string = args[0];
        int age = Integer.parseInt(age_string);


        // Adult, Minor, Senior
        //  Senior > 65,
        // Minor < 18
        // Adult > 18

        String result = age<18 ? "Minor" :age<65? "Senior": "Adult";

        System.out.println(result);

    }
}
