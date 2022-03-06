//Assignment 3
 
class starpattern16
{
	public static void main(String[] args)
	{  
		for(int i=1;i<5;i++)
		{   if(i==1)
			{
				System.out.print(" ");
			}
				
	
			for(int j=5;j>=i;j--)
			{			
				System.out.print(" ");					
			}
			
			System.out.print("*");
				if(i!=1)
				{
					for(int k=1;k<=1;k++)
					{
						for(int j=1;j<=i-1;j++)
						{			
						System.out.print(" ");					
						}					
				    System.out.print("*");					
					}
				}
				
			System.out.println();			
		}
		System.out.print(" ******");		

	}
}
	
			
		
		