import java.util.Scanner;
public class Sum{
    public static void main(String []args){
        Scanner sob= new Scanner(System.in);
        System.out.println("Enter two values to make sum : ");
        int a =  sob.nextInt();
        int b=  sob.nextInt();
        int sum = a+b;

        System.out.println("sum of given no is = "+sum);
    }
}