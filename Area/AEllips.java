
import java.util.Scanner;

public class AEllips{
	public static void main(String []args){
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the radius1 and radius2 of ellips : ");
		double r1= n.nextDouble();
		
		double r2 = n.nextDouble();
	
		System.out.println("the area of Ellips   is = "+((r1+r2)*Math.PI));

	}



}