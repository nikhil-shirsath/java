
import java.util.Scanner;

class Factorial{

	public static void main(String []args){

	Scanner sob = new Scanner(System.in);

	System.out.println("Enter a  no to calculate its factorial ");

	int num = sob.nextInt();
	if(num>=0){
		int f=1;
		while(num>=2){
			f*=num;
			num--;

			}

		System.out.println("factrial of "+num+" = "+f);

		}
	else{
		System.out.println("Incvalid input ");
		}

	}



}