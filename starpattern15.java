//Assignment 3
 
class starpattern15
{
	public static void main(String[] args)
	{  
		for(int i=1;i<5;i++)
		{   
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
		System.out.print("******");		

	}
}
	
			
		
		