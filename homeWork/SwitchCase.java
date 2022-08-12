import java.util.Scanner;
public class SwitchCase{
     public static void main(String []args){
     Scanner sobjr=new Scanner(System.in);
     System.out.println("1.Area of Circle");
     System.out.println("2.Area of Ellipse");
     System.out.println("3.Perameter of circle");
     System.out.println("Enter your Choice");
     int ich=sobjr.nextInt();
     double r1,r2;

    switch(ich)
    {
     case 1:
     System.out.println("Enter the Redius");
     double r1=sobjr.nextDouble();
     System.out.println("Area of Circle="+(Math.PI*r1*r1));
     break;

     case 2:
     System.out.println("Enter the Redius r1 and r2");
     double r1=sobjr.nextDouble();
     double r2=sobjr.nextDouble();
     System.out.println("Area of Ellipse="+(Math.PI*r1*r2));
     break;

     case 3:
     System.out.println("Enter the Redius ");
     double r1=sobjr.nextDouble();
     System.out.println("Perameter of circle="+( 2*Math.PI*r1));
     break;

    default:
    System.out.println("wrong choice");
    break;
   }

 }

}
    