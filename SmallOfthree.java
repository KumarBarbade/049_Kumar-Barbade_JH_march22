import java.util.*;

//10.Write a Java Program to find the smallest of 3 numbers (a,b,c)
class SmallOfthree
{
	 public static void main(String[] args) 
  {
     int sum=0,rem;
    
     Scanner sc = new Scanner(System.in);  
     System.out.println("Enter values for a b c: ");  
         
        a = sc.nextInt(); 
        b = sc.nextInt();  
        c = sc.nextInt();  		
    if(a<b && a<c) 
	System.out.println(" a is small");
    else {if(b<c)
	System.out.println("b is small"+sum);
    else
    System.out.println("c is small"+sum);
	} 
  }
}
