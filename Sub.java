import java.util.Scanner;

class Sub{
    public static void main(String []args){

        Scanner son = new Scanner(System.in);

        System.out.println("Enter two values to sunbstraction :");
        float a= son.nextFloat();
        float b= son.nextFloat();
        float ans = a-b;
        System.out.println("the ans of substraction is  =  "+ans);
    }
}