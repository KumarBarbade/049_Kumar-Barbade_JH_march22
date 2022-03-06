//Assignment 3
 
class starpattern7
{
	public static void main(String[] args)
	{ 
	int l=1;
		for(int i=1;i<=4;i++)
		{   
	        
	        for(int j=4;j>=i-1;j--)
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
		
	 int m=4;
		for(int i=5;i>=1;i--)
		{   
	        
	        for(int j=5;j>=i;j--)
			{			
				System.out.print(" ");					
			}
			
			
			for(int k=1;k<=(i+m);k++)
			{			
				System.out.print("*");					
			}
            m--;
			System.out.println();			
		}
		
	}
}
	