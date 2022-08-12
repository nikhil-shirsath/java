/* large mistakes solve in future






import java.util.Scanner;

class PrimeDigitAlsoPrimeSeries{

 public static void main(String []args){

   Scanner sob = new Scanner(System.in);

   System.out.println("\t\t Programm for prime no ");

   System.out.println("Enter no till you have to print the prime no  : ");

   int n = sob.nextInt();

   int r=1;
   while(r<=n)


		// here the logic for the prime no is starts
   		{

		int num =r;
   		int i=2,count=0;

   		while(i<=num/2){
   			if(num%i== 0)

				break;

		i++;

 		}

 		if(i == num/2+1){		//here we got a prime no num


 			while(num!=0){
				int digit= num%10;
				i=2;
				while(i<=digit/2){

					if(digit%i==0)
						break;
					i++;
				}

				int sum=0;
				if(i== num/2+1){

					sum+=digit;

					}
					System.out.println(sum);


			num/=10;
			}
			System.out.println();

		}




//------------------------------------------------
r++;
}
// here the logic to check the prime no ends





//---------------------------------------------------------------

}
}





*/