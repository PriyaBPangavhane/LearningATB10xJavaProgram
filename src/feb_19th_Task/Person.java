package feb_19th_Task;

public class Person {

    String name;
    int age;
    long mob_no;
    boolean isMarried;
    boolean isMale;


    public Person()
    {
        name = "Unknown Name";
        age = 0;
        mob_no = 0;
        isMale = true;
        isMarried = true;
    }

    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Contact Number: "+mob_no);
        System.out.println("Marital Status: "+isMarried);
        System.out.println("Gender: "+isMale);
    }
}
