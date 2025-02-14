package feb_05_Task;

public class sumNaturalNumberWhileLoop {
    public static void main(String[] args) {
        int number=1;
        int sum=0;

        while(number<=10)
        {
            sum+=number;
            number++;
        }
        System.out.println(sum+":Sum of first 10 natural Number");
    }
}
