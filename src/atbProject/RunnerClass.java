package atbProject;

public class RunnerClass {

    public static void main(String[] args) {
        Payment p1 = new Payment();
        p1.name ="Priya";
        p1.mob_no =90281;
        p1.studDetails();
        System.out.println("--**--**--**--**--**--");
        p1.paymentMode = "Online";
        p1.getPaymentMode();
        System.out.println("--**--**--**--**--**--**--");
        //p1.courseNames= new String[]{"Automation"};
        courses c1 = new courses();
        c1.courseN();



    }
}
