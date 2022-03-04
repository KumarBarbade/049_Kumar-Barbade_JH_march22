// Java program to convert a decimal  number to hexadecimal number

import java.io.*;
import java.util.Scanner;


class Decitohexa
 {
	// function to convert decimal to hexadecimal
	static void decToHexa(int n)
	{
		// char array to store hexadecimal number
		char[] hexaDeciNum = new char[100];

		// counter for hexadecimal number array
		int i = 0;
		while (n != 0) {
			// temporary variable to store remainder
			int temp = 0;

			// storing remainder in temp variable.
			temp = n % 16;

			// check if temp < 10
			if (temp < 10) {
				hexaDeciNum[i] = (char)(temp + 48);
				i++;
			}
			else {
				hexaDeciNum[i] = (char)(temp + 55);
				i++;
			}

			n = n / 16;
		}

		// printing hexadecimal number array in reverse
		// order
		for (int j = i - 1; j >= 0; j--)
			System.out.print(hexaDeciNum[j]);
	}

	
	public static void main(String[] args)
	{
	Scanner ps=new Scanner(System.in);
	System.out.println("Enter Decimal number = ");
	
	int n= ps.nextInt();
    decToHexa(n); 
	
	}
}







/*
class Decitohexa
{
	public static void decToHexa(int n)
	{
		System.out.println(Integer.toHexString(n));
	}
	public static void main(String[] args)
	{

		Scanner ps=new Scanner(System.in);
	System.out.println("Enter number= ");
	
	int n= ps.nextInt();
		decToHexa(n);
	}
}
*/



