import java.util.*;


//14.Write a java program to LCM of TWO given number.
class LCM
{  
	public static void main(String args[])  
    {  
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter the first number: ");         
    int x = sc.nextInt();  
     
    System.out.print("Enter the second number: ");        
    
    int y = sc.nextInt();  
      
    int i;  
      
    int a =((x > y)? x : y);  
      
    for(i = a ; i <= x*y ; i = i + a)  
    {  
     
    if(i % x == 0 && i % y == 0)  
    break;  
    }  
     
    System.out.println("LCM of "+x+" and "+y+" is: "+i);  
    }  
}  