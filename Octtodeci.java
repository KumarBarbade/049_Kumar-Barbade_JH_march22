
import java.util.Scanner;
 class Octtodeci 
{

    public static void main(String[] args)
	{
        Scanner ps=new Scanner(System.in);
	System.out.println("Enter Octal number= ");
	
	int octal= ps.nextInt();
        int decimal = convertOctalToDecimal(octal);
        System.out.printf("%d in octal = %d in decimal", octal, decimal);
    }

    public static int convertOctalToDecimal(int octal)
    {
        int decimalNumber = 0, i = 0;

        while(octal != 0)
        {
            decimalNumber += (octal % 10) * Math.pow(8, i);
            ++i;
            octal/=10;
        }

        return decimalNumber;
    }
}