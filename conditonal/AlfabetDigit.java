
import java.util.Scanner;

public class AlfabetDigit{

	public static void main(String []args){


		Scanner sob= new Scanner(System.in);

		System.out.println("Enter any charecter to check alfabet or digit : ");

		char cv= sob.next().charAt(0);
		if(cv >= 48 && cv <=57){
		System.out.println(" the charecter is digit ");
		}
		else 
		if((cv >= 65 && cv<=90)||(cv >=97 && cv <=122)){
		System.out.println(" the charecter alfabet");
		}

	}




}

