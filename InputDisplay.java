import java.util.Scanner;

class InputDisplay
{
	public static void main(String[] args)
	{
		
		
		/*
		String n1  = args[0];
		String n2  = args[1];
		
		int i = Integer.parseInt(n1);
		int j = Integer.parseInt(n2);
		
		System.out.println("Test data= "+(i+j));
		*/
		
		
		Scanner ps=new Scanner(System.in);
		System.out.println("Input first number: ");
		int n1= ps.nextInt();
		
		System.out.println("Input second number: ");
		int n2= ps.nextInt();
		
		System.out.println("125+24 = "+(n1+n2));
		System.out.println("125-24 = "+(n1-n2));
		System.out.println("125*24 = "+(n1*n2));
		System.out.println("125/24 = "+(n1/n2));
		System.out.println("125%24 = "+(n1%n2));
	}
}