import java.util.Scanner;

public class Dec{

public static void main(String []args){
	Scanner s= new Scanner(System.in);

	System.out.println("Ente any decimal value : ");
	double val = s.nextDouble();

	double ans = Math.round(val*100)/100.0;
	System.out.println("the answer that you want is = "+ans);


}
}