//Assignment 3
 
class starpattern5
{
	public static void main(String[] args)
	{ int l=1;
		for(int i=1;i<=5;i++)
		{   
	        
	        for(int j=5;j>=i;j--)
			{			
				System.out.print(" ");					
			}
			
			
			for(int k=1;k<(i+l);k++)
			{			
				System.out.print("*");					
			}
            l++;
			System.out.println();			
		}
	}
}
	