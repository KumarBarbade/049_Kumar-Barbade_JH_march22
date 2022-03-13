import java.util.*;


//15.Check whether the Given Number is a Palindrome or NOT.
class Palindrome
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter number: ");         
    int num = sc.nextInt();  
	
    int  rev = 0, rem;
    
   
    int num = temp;
    
    
    while (num != 0)
		{
      rem = temp % 10;
      rev = rev * 10 + rem;
      temp /= 10;
        }
    
    
    if (num == rev) 
	{
      System.out.println(num + " is Palindrome");
    }
    else 
	{
      System.out.println(num + " is not Palindrome");
    }
  }
}
