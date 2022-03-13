import java.util.*;


//Swap two numbers without using third variable approach.
class Swap   
{  
    public static void main(String args[])   
    {   
        System.out.println("Enter the value of n1 and n2");  
        Scanner sc = new Scanner(System.in);  
        
        int n1 = sc.nextInt();  
        int n2 = sc.nextInt();  
        System.out.println("before swapping numbers: "+n1 +" "+ n2);  
      
        n1 = n1 + n2;   
        n2 = n1 - n2;   
        n1 = n1 - n2;   
        System.out.println("After swapping: "+n1 +"  " + n2);   
    }   
}  