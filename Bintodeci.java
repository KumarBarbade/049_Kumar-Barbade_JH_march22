import java.util.Scanner;

//Binary to Decimal Conversion Using Custom Method
class Bintodeci 
{
    
  public static void main(String[] args) 
  {

    // enter binary number
    // decimal number
    Scanner ps=new Scanner(System.in);
	System.out.println("Enter number= ");
	
	long num= ps.nextLong();

    // call method by passing the binary number
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
    
    // binary number
    String binary = "01011011";
    
    // convert to decimal
    int decimal = Integer.parseInt(binary, 2);
    System.out.println(binary + " in binary = " + decimal + " in decimal.");
  }
}
*/