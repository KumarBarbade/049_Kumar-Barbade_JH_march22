
import java.util.Scanner; 
class Bintohexa
{

	
	int binaryToDecimal(long binary)
	{

		int decimalNumber = 0, i = 0;

		
		while (binary > 0) 
		{

			
			decimalNumber
				+= Math.pow(2, i++) * (binary % 10);

			
			
			binary /= 10;
		}

		
		return decimalNumber;
	}

	
	String decimalToHex(long binary)
	{
		
		int decimalNumber = binaryToDecimal(binary);

		
		String hexNumber
			= Integer.toHexString(decimalNumber);

		
		hexNumber = hexNumber.toUpperCase();

		
		return hexNumber;
	}

	
	public static void main(String[] args)
	{

		
		Bintohexa ob = new Bintohexa();

		Scanner ps=new Scanner(System.in);
	System.out.println("Enter Binary number= ");
	
	long num= ps.nextLong();
	
		
		System.out.println("Inputted number : " +num);
		System.out.println(ob.decimalToHex(num));
	}
}
