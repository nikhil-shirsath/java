import java.util.Scanner;

class FactPrimeSeries{

 public static void main(String []args){

   Scanner sob = new Scanner(System.in);

   System.out.println("\t\t Programm for prime no ");

   System.out.println("Enter the term till you want to print the series  : ");

   int n = sob.nextInt();

	int r=1;
		while(r<=n){
		//from here the logic for the factorial is start

		int f=1;
		int j=r;
		int i=1;

		while(i<=j){
			f*=i;
			i++;
		}
		System.out.print("\t"+f);

		//from here the logic for the factorial is ends

		// here the logic for the prime no is starts
		{

		int num =r;
   		i=2;
   		int count=0;

   		while(i<=num/2){
  			if(num%i== 0)
				break;

			i++;

 		}

 	if(i == num/2+1)
 	System.out.print("\t "+num);
// here the logic to check the prime no ends

	r++;
	}



  }
}
}