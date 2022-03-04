import java.util.Scanner;

class CircleAP
{
	public static void main(String[] args)
	{	
		
		Scanner ps=new Scanner(System.in);
		System.out.println("Radius: ");
		double n1= ps.nextDouble();
		
		double pi=3.14159265358979;
		double P=2*pi*n1;
		double A=pi*n1*n1;
		System.out.println("Perimeter = "+P);
		System.out.println("Area = "+A);
		
	}
}