
import java.util.Scanner;

public class SACylinder{
	public static void main(String []args){
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the radius and the height of the Cylinder : ");
		double r= n.nextDouble();
		double h= n.nextDouble();
		
		System.out.println("the Surface area of Cylinder  is = "+(2*Math.PI *r*r + 2*Math.PI*r*h));

	}



}