import java.util.*;

//9.Write a Java Program to find sum of the digits of a given number.
class SumOfdigit
{
	 public static void main(String[] args) 
  {
     int sum=0,rem;
    
     Scanner sc = new Scanner(System.in);  
     System.out.println("Enter integer number: ");  
         
        n = sc.nextInt();  
    while(n!=0) 
	{
		rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
      System.out.println("Sum of digits of number is : "+sum);
      
  }
}