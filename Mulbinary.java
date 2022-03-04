import java.util.Scanner;
 class Mulbinary 
{
 public static void main(String[] args)
 {
  long b1, b2, mul = 0;
  int digit, factor = 1;
  Scanner in = new Scanner(System.in);
  System.out.println("Input the first binary number: ");
  b1 = in.nextLong();
  System.out.println("Input the second binary number: ");
  b2 = in.nextLong();
  while (b2 != 0) // 11!=0  true
  {
   digit = (int)(b2 % 10);  // digit=1
   if (digit == 1)  //  true
   {
    b1 = b1 * factor;  // b1= 10*1=10
    mul = binaryproduct((int) b1, (int) mul);  // mul=10
   } 
   else
   {
    b1 = b1 * factor;
   }
   b2 = b2 / 10; //  b2=1
   factor = 10; 
  }
  System.out.println("Product of two binary numbers: " + mul); //
 }
 
 
 static int binaryproduct(int b1, int b2) // b1=10  b2= 0
 {
  int i = 0, remainder = 0;  
  int[] sum = new int[20];
  int binary_prod_result = 0;

  while (b1 != 0 || b2 != 0)   // 10!=0 true
  {
   sum[i++] = (b1 % 10 + b2 % 10 + remainder) % 2;  //sum[0]= 0
   remainder = (b1 % 10 + b2 % 10 + remainder) / 2;  //remainder= 0
   b1 = b1 / 10; //b1=0
   b2 = b2 / 10; //b2=0
  }
  if (remainder != 0) 
  {
   sum[i++] = remainder;
  }
  --i; // i=0
  while (i >= 0)  // true
  {
   binary_prod_result = binary_prod_result * 10 + sum[i--]; //  10
  }
  return binary_prod_result;  // 10
 }
 }