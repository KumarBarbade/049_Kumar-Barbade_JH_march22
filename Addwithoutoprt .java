import java.util.*;

//11.How to add two numbers without using the arithmetic operators in Java?
class Addwithoutoprt 
 
 {  
 
  public static void main(String[] args) 
  {
	  Scanner sc = new Scanner(System.in);  
     System.out.println("Enter n1 and n2: ");  
         
        n1 = sc.nextInt(); 
        n2 = sc.nextInt(); 
     
  
	for (int i = 1; i <= n2; i++) 
    {
      n1++;
    }
	  System.out.println("Sum of two numbers:"n1); 
    
  }
 
}