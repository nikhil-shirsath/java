import java.util.Scanner;

public class SwitchCondition{

	public static void main(String []args){

	Scanner sob = new Scanner(System.in);

		System.out.println("1. Area of Circle");
		System.out.println("2. Area of Square");
		System.out.println("3. Area of ellips");
		System.out.println("4. perimiter of Circle");


		System.out.println("Enter Your choice No : ");

		int n = sob.nextInt();

		switch(n){


		case 1 :
			
			System.out.println("Enter the radius of the  circle");			
			double r1 = sob.nextDouble();

			System.out.println("Area of the Circle : "+ Math.PI *r1*r1);
			
			break;  
			

		case 2 :
			
			System.out.println("Enter the side of the  square");			
			double side = sob.nextDouble();

			System.out.println("Area of the Squere : "+ side * side);
			
			break;
						

			

		case 3 :
			
			System.out.println("Enter the radius1 and radius2  of the  ecllipse");			
			double r1 = sob.nextDouble();
			double r2 = sob.nextDouble();
			System.out.println("Area of the Circle : "+ Math.PI *r1*r2);
			
			break;		

			

		case 4 :
			
			System.out.println("Enter the radius of the circle ");			
			double r1 = sob.nextDouble();
			
			System.out.println("Perimeter of the circle : "+ 2* Math.PI *r1);
			
			break;
			

		default :

			System.out.println(" the case is not matched");	
			
		}

	}


}