import java.util.*;

//17.To print the following series EVEN number Series 2 4 6 8 10 12 14 16 .....
class EvenSeries
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter even number: ");         
    int num = sc.nextInt();  
	
    int i=2;
    System.out.println("Even number series : ");
    while (i<=num)
		{
         System.out.print(i+" ");
			i+=2;
        }
    
  }
}