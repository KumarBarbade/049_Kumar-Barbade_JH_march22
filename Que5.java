import java.util.*;



//5. Write a program which prints the length of each word in a sentence.
class Que5
	{
		public static void main(String[] args) 
  {
	  
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any string :");
		String	s=sc.nextLine();
            	char arr[]=s.toCharArray();
            
            	int x=arr.length,y=0;
            	
            	for(int i=0;i<x;i++)
            	{
                	if(arr[i]==' ')
                	{
                		System.out.print((i-y)+" ");
                		y=i+1;
                	}
            	}
            	System.out.println();
	}
	}