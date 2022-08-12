


import java.util.Scanner;

class FactSeries{


	public static void main(String []args){

	Scanner sobj = new Scanner(System.in);

	int num = sobj.nextInt();
	int i=1;
	while(i<=num){

	int f=1;

	while(i!=1){
	f*=i;
	i--;

	}
	System.out.println(f);

	i++;
	}





	}



}