
import java.util.Scanner;

public class Vowel{


	public static void main(String []args){

	Scanner sob = new Scanner(System.in);

	System.out.println("Enter any alfabet to check vowel : ");

	char cv = sob.nextLine().charAt(0);

	if((cv>=65 && cv<= 90)||(cv >= 97 && cv <= 122)){

		if(cv== 'a' || cv=='e' || cv== 'i'  || cv == 'o' || cv=='u' || cv== 'A' || cv== 'E' || cv=='I' || cv== 'O' || cv == 'U' ){

		System.out.println("vowel");
		}
		else{
		System.out.println("Consontant");
		}
	
	}
	else{
	System.out.println("Charecter is not an Alfabet");
	}
}

}