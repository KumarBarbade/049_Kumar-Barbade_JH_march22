//Assignment 3
 
class HIHP
{
	public static void main(String[] args)
	{  for(int l=1;l<=6;l++)
		{			
		System.out.print("*");					
		}	
	System.out.println();
		for(int i=1;i<=5;i++)
		{   
			System.out.print("*");
				if(i!=5)
				{
					for(int k=1;k<=1;k++)
					{
						for(int j=4;j>=i+1;j--)
						{			
						System.out.print(" ");					
						}					
				    System.out.print("*");					
					}
				}
				
			System.out.println();			
		}
				

	}
}
	
			
		
		