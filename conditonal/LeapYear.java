import java.util.Scanner;

  
public class LeapYear{

public static void main(String []args){

	Scanner  sobj = new Scanner(System.in);

	System.out.println("Enter any year to check that is leap or not : ");

	int year = sobj.nextInt();

	if(year %4 == 0){
		if(year%100 == 0){
			if(year%400==0){
			System.out.println(year+"year is a leap year ");
			}
			else{
			System.out.println(year +" year is not a leap year");
			}
	
		}
		else{
		System.out.println(year + " year is leap year");	
		}
	}
	else{

	System.out.println(year+" year is not Leap Year ");
	}



  }


}