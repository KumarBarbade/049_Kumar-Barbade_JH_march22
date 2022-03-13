import java.util.*;



//5.How to check the given number is Positive or Negative in Java?
class PositiveNegative  
{  
    public static void main(String[] args)   
    {   
        System.out.println("Enter any integer :");  
        Scanner sc = new Scanner(System.in);  
        
        int num = sc.nextInt();  
        
		if(num>=0)
		System.out.println("Positive"); 
		else
		System.out.println("Negative"); 	      
    }   
}  