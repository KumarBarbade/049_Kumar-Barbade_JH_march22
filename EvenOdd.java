
import java.util.*;

//1. Check the given number is EVEN or ODD.
class EvenOdd 
{

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);

    }
}