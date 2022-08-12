// 2 5 4 10 8 15..........................1024 50


class Series6DoWhile{

public static void main(String []args){


int i=2 , j=5;
do{

	System.out.print(i+"\t"+j+"\t");
	i*=2;
	j+=5;
	}while(i<=1024);
}


}