
import java.util.Scanner;
/*
//Decimal to Binary Conversion using Custom Method
class Decitobin
{

  public static void main(String[] args) 
  {
	   // decimal number
    Scanner ps=new Scanner(System.in);
	System.out.println("Enter number= ");
	
	int num= ps.nextInt();
  
    
    System.out.println("Decimal to Binary");

    // call method to convert to binary
    int binary = convertDecimalToBinary(num);

    System.out.println("\n" + num + " = " + binary);
    }
	
	
	

  public static int convertDecimalToBinary(int n) 
  {

    int binaryNumber = 0;
    int remainder, i = 1, step = 1;

    while (n!=0) 
	{
      remainder = n % 2;
        System.out.println("Step " + step++ + ": " + n + "/2");

        System.out.println("Quotient = " + n/2 + ", Remainder = " + remainder);
        n /= 2;

        binaryNumber += remainder * i;
        i *= 10;
    }
    
    return binaryNumber;
    }
	
}
*/




//Decimal to Binary Conversion using toBinaryString()
class Decitobin
 {
  public static void main(String[] args) 
  {
    
    // decimal number 
    Scanner ps=new Scanner(System.in);
	System.out.println("Enter number= ");
	
	int decimal= ps.nextInt();
    
    // convert decimal to binary
    String binary = Integer.toBinaryString(decimal);
    System.out.println(decimal + " in decimal = " + binary + " in binary.");
  }
}
