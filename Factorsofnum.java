import java.util.*;

//8.Write a Java Program to print all the Factors of the Given number.
class Factorsofnum
 {

  public static void main(String[] args) 
  {

    
     Scanner sc = new Scanner(System.in);  
     System.out.print("Enter positive number: ");  
         
        n = sc.nextInt();  

    System.out.println("Factors of " + n + " are: ");

    
    for (int i = 1; i <= n; ++i) 
	{

      
      if (n % i == 0)
		{
        System.out.println(i + " ");
        }
	}
    
  }
}
	