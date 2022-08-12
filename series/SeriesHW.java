
// 1 10 2 20 30 40 50 6 60 7 70 8 80  9 10


class SeriesHW{

	public static void main (String []args){

		int i=1;

		while(i<=10){

			if(i<=2){
				System.out.print(i+"\t"+(i*10)+"\t");

				}
			else if (i>=3&& i<=5){
				System.out.print(i*10+"\t");
				}
			else if(i>=6&&i<=8){
				System.out.print(i+"\t"+(i*10)+"\t");
				}
			else{

			System.out.print(i+"\t");
			}

			i++;


			}



		}



}
