import java.util.Scanner;
import java.text.DecimalFormat;

public class useFormat{


public static void main(String []args){

		Scanner n = new Scanner(System.in);

		System.out.println("Enter any value to get 2 decimal value round up : ");
		double value = n.nextDouble();
		String ans = new DecimalFormat("0.00").format(value);
		(double)ans;
		System.out.println(typeof(ans));

}

}
