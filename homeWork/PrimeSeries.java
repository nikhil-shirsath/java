import java.util.Scanner;

class PrimeSeries{

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
   if(num%i== 0){

	break;
	}

	i++;

 }

 if(i == num/2+1)
 System.out.print("\t "+num);


r++;
}
// here the logic to check the prime no ends







}
}