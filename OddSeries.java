import java.util.*;

//To print the following series ODD number Series 1 3 5 7 9 11 13 ....
class OddSeries
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter odd number: ");         
    int num = sc.nextInt();  
	
    int i=1;
    System.out.println("ODD number series : ");
    while (i<=num)
		{
         System.out.print(i+" ");
			i+=2;
        }
    
  }
}