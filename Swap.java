import java.util.Scanner;

class Swap
{
	public static void main(String[] args)
	{	
		
		Scanner ps=new Scanner(System.in);
		System.out.println("Enter n1= ");
		double n1= ps.nextDouble();
		
		System.out.println("Enter n2= ");
		double n2= ps.nextDouble();
		System.out.println("Before  swap : n1="+n1+"  n2="+n2);
		
		n1=n1+n2; //12+10=22
		
		n2=n1-n2;//22-10=12
		
		n1=n1-n2;//22-12=10
		
		System.out.println("After  swap : n1="+n1+"   n2="+n2);
		
		
	}
}