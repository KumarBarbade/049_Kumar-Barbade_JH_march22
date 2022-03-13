import java.util.*;


//6.Write a Java Program to find whether given number is Leap year or NOT?
 class Leapyear
 {

  public static void main(String[] args) 
  {
	   Scanner sc = new Scanner(System.in); 
        System.out.println("Enter year :");  
         
        int y = sc.nextInt();  
        
    if ((y%4==0 || y%400==0) && y%100!=0)
      System.out.println(y + " is a leap year.");
    else
      System.out.println(y + " is not a leap year.");  
  }
}
