import java.io.*;
import java.util.Scanner;
 
class Decitooct
 {
    public static void decToOct(int n)
    {
        System.out.println(Integer.toOctalString(n));
    }
    public static void main(String[] args)
    {
 
        Scanner ps=new Scanner(System.in);
	System.out.println("Enter Decimal number= ");
	
	int n= ps.nextInt();
	System.out.println("Enter Octal number= ");
        decToOct(n);
    }
}