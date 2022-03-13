import java.util.*;



//12.Write a java program to Reverse a given number.
class Revnum
{
  public static void main(String[] args) 
  {
	   Scanner sc = new Scanner(System.in);  
     System.out.println("Enter number: ");  
         
        num = sc.nextInt(); 

    int  rev = 0;
    
    while(num != 0) 
	{
      int digit = num % 10;
      rev = rev * 10 + digit;
      num /= 10;
    }

    System.out.println("Reversed Number: " + rev);
  }
}