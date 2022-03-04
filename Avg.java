import java.util.Scanner;

class Avg
{
	public static void main(String[] args)
	{	
		
		Scanner ps=new Scanner(System.in);
		System.out.println("Enter n1= ");
		double n1= ps.nextDouble();
		
		System.out.println("Enter n2= ");
		double n2= ps.nextDouble();
		
		System.out.println("Enter n3= ");
		double n3= ps.nextDouble();
		
		
		System.out.println("Average = "+((n1+n2+n3)/3));
		
		
	}
}