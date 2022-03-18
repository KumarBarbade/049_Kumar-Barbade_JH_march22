import java.util.*;


//3. Write a function to replace multiple consecutive occurrences of characters with a single //character
/*
//logic 2
class Que3
	{
		public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :  ");
        	String s=sc.nextLine();
            	char arr[]=s.toCharArray();
            	int x=arr.length, count;
            
            	for(int i=0;i<x-1;i++)
            	{
             	   count=0;
                	for(int j=0;j<x;j++)
                	{
                    		if(arr[i]==arr[j])
                    		{
                        		count++;
                        		if(count>1)
                        		{
                            			arr[j]=' ';
                            			break;
                        		}
                    		}
                	}
            	}
				
            	for(int i=0;i<x;i++)
            	{
                	if(arr[i]!=' ')
                    	System.out.print(arr[i]);
            	}
            	System.out.println();
		}
	}
	
*/


/*
//Kumar logic	
class Que3
	{
		public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :  ");
        String s=sc.nextLine();   //aaabbeec
        char arr[]=s.toCharArray();
        int x=arr.length;
		
            
           for(int i=0;i< x-1;i++)
           {
		 
		     //System.out.print(arr[i]);
			 int j=i+1;
			 if(j!=(x-1))
			 {
				if(arr[i]==arr[j])
				{
		     	continue;
				 
				}
		       
				 
				else 
				 System.out.print(arr[i]);
			 }
			 
			 
		 	 else{
				    if(arr[i]!=arr[j])
					{
				     System.out.print(arr[i]);
				     System.out.print(arr[j]);
					}
				 else
					 System.out.print(arr[j]);
			}
		}
	}	 
}  
						
*/         	   	
            	
		
	
	
	
	
/*	
//logic 3
	class Que3
	{
		public static void main(String[] args) 
		{
	        	Scanner sc=new Scanner(System.in);
	        	System.out.println("Enter the string :  ");
	        
	        String word=sc.nextLine();
            StringBuilder res=new StringBuilder();
            char first=word.charAt(0);
            res.append(first);
            for (int i = 1; i < word.length(); i++) 
			{
                char ch=word.charAt(i);
                if(ch!=first)
				{
                   res.append(ch);
                }
               first=ch;
            }
            System.out.println(res);
		}
	}
	*/
	
	
	
	
	
/*	
//logic 4
 class Que3 
{
 
   public static void main(String[] args) 
   {
 
      String str = "hheeeeellllllooooo    woooooorrrrrldddddd      !!!!!!!!!";
      System.out.println(str);
      str = str.replaceAll("(.)\\1+","$1");
      System.out.println(str);
   }
}
*/


//logic 5
class Que3
	{
		public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :  ");
        String s=sc.nextLine();   //aaabbeec
        char arr[]=s.toCharArray();
        int x=arr.length;
		
            
           for(int i=0;i< x-1;i++)
           {
		 
		     //System.out.print(arr[i]);
			 int j=i+1;
			 if(j!=(x-1))
			 {
				if(arr[i]==arr[j])
				{
		     	continue;
				 
				}
		       
				 
				else 
				 System.out.print(arr[i]);
			 }
			 
			 
		 	 else{
				    if(arr[i]!=arr[j])
					{
				     System.out.print(arr[i]);
				     System.out.print(arr[j]);
					}
				 else
					 System.out.print(arr[j]);
			}
		}
	}	 
}  