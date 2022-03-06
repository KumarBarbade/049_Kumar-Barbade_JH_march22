//Assignment 3
 
class pattern10
{
	public static void main(String[] args)
	{  char ch=69;
		for(int i=1;i<=5;i++)
		{ 
	        for(int j=5;j>=i;j--)
			{	
				
				System.out.print(" ");	
				
			}
			for(char k=ch;k<=69;k++)
			{	
				
				System.out.print(k+" ");	
				
			}
			ch--;
			System.out.println();			
		}
	}
}
	