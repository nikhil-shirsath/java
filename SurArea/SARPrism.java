
import java.util.Scanner;

public class SARPrism{
	public static void main(String []args){
		Scanner n = new Scanner(System.in);
		System.out.println("Enter length hight and width of Rectangular Prism : ");
		double a= n.nextDouble();
		double b= n.nextDouble();
		double c= n.nextDouble();
		System.out.println("the Surface area of Rectangular Prism is = "+(2*a*b +2*b*c+2*c*a));

	}



}