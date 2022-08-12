
import java.util.Scanner;

public class ATrapezoid{
	public static void main(String []args){
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the base1 and base2 and height of the trapezoid  : ");
		double b1= n.nextDouble();
		
		double b2 = n.nextDouble();
		double h = n.nextDouble();
		System.out.println("the area of Trapezoid   is = "+((b1+b2)*h/2));

	}



}