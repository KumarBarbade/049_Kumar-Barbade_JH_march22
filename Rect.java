import java.util.Scanner;

class Rect
{
	public static void main(String[] args)
	{	
		
		Scanner ps=new Scanner(System.in);
		System.out.println("width= ");
		double w= ps.nextDouble();
		
		System.out.println("height= ");
		double h= ps.nextDouble();
		
		double p=2*(w+h);
		double a=w*h;
		System.out.println("2*("+w+"+"+h+")="+p);
		System.out.println(w+"*"+h+"="+a);
		
	}
}