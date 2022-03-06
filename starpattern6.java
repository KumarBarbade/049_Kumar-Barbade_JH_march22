//Assignment 3
 
class starpattern6
{
	public static void main(String[] args)
	{ 
	
		
	int l=5;
		for(int i=5;i>=1;i--)
		{   
	        
	        for(int j=5;j>=i;j--)
			{			
				System.out.print(" ");					
			}
			
			
			for(int k=1;k<(i+l);k++)
			{			
				System.out.print("*");					
			}
            l--;
			System.out.println();			
		}
		
	}
}
	