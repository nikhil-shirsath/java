import java.util.Scanner;

class Prime{

 public static void main(String []args){

   Scanner sob = new Scanner(System.in);

   System.out.println("Programm for prime no : ");

   System.out.println("Enter no to check prime no : ");

   int num = sob.nextInt();

   int i=2,count=0;

   while(i<=num/2){
   if(num%i== 0){
   System.out.println("the no is not a  prime ");
	break;
	}

	i++;

 }

 if(i == num/2+1)
 System.out.println("the no is prime ");


}
}