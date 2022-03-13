import java.util.*;


//13.Write a Java Program to find GCD of two given numbers.
class GCD
{
  public static void main(String[] args) 
  {
	  Scanner sc = new Scanner(System.in);  
     System.out.println("Enter n1 and n2: ");  
         
        n1 = sc.nextInt(); 
		n1 = sc.nextInt(); 
    
    
    int gcd = 1;

    for (int i = 1; (i <= n1 && i <= n2); ++i) 
	{

      
      if ((n1 % i == 0) && (n2 % i == 0))
	  {
        gcd = i;
	  }
    }

    System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
  }
}
