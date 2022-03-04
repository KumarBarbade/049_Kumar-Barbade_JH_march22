// Java program to convert a decimal  number to hexadecimal number

import java.io.*;
import java.util.Scanner;

/*
class Decitohexa
 {
	
	static void decToHexa(int n)
	{
		
		char[] hexaDeciNum = new char[100];

		
		int i = 0;
		while (n != 0) {
			
			int temp = 0;

			
			temp = n % 16;

			
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

*/






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
	System.out.println("Hexadecimal number= ");
		decToHexa(n);
	}
}




