import java.util.Scanner;


class Bintodeci 
{
    
  public static void main(String[] args) 
  {

    
    Scanner ps=new Scanner(System.in);
	System.out.println("Enter number= ");
	
	long num= ps.nextLong();

    
    int decimal = convertBinaryToDecimal(num);

    System.out.println("Binary to Decimal");
    System.out.println(num + " = " + decimal);
  }

  public static int convertBinaryToDecimal(long num) 
  {
    int decimalNumber = 0, i = 0;
    long remainder;
    
    while (num != 0) 
	{
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber;
  }
}




/*
//Binary to Decimal Conversion Using parseInt()
class Bintodeci 
{
  public static void main(String[] args) 
  {
    
    
    Scanner ps=new Scanner(System.in);
	System.out.println("Enter binary number= ");
	
	int binary= ps.nextInt();
    
    
    int decimal = Integer.parseInt(binary, 2);
    System.out.println(binary + " in binary = " + decimal + " in decimal.");
  }
}
*/