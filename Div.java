//import java.util.Scanner;

class Div
{
	public static void main(String args[])
	{
		 /*
		System.out.println("Test data= "+(50/3));
		*/
		
		/*
		String n1=args[0];
		String n2=args[1];
		
		int i = Integer.parseInt(n1);
		int j = Integer.parseInt(n2);
		
		
		System.out.println("Test data= "+args[0]);
		System.out.println("Test data= "+args[1]);
		System.out.println("Test data= "+(i/j));
		*/
		
		
		Scanner ps=new Scanner(System.in);
		System.out.println("Enter n1= ");
		int n1= ps.nextInt();
		
		System.out.println("Enter n2= ");
		int n2= ps.nextInt();
		
		System.out.println("sum= "+(n1/n2));
		
		
	}
}