import java.util.*;



/*1. Write a program which takes a string and prints the number of vowels, consonants(non-vowels).
numbers and other characters.
Input: "Hello world 37 1!"
*/

class Que1 
{

  public static void main(String[] args) 
  {
	  Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any string :");
		String	s=sc.nextLine();
		
    
    int vowels = 0, consonants = 0, digits = 0, spaces = 0;

    s = s.toLowerCase();
    for (int i = 0; i < s.length(); ++i) 
	{
      char ch = s.charAt(i);

   
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		  {
        ++vowels;
      }

      
      else if ((ch >= 'a' && ch <= 'z')) 
	  {
        ++consonants;
      }
      
     
      else if (ch >= '0' && ch <= '9') 
	  {
        ++digits;
      }
      
      
      else if (ch == ' ')
		  {
        ++spaces;
      }
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
    System.out.println("Digits: " + digits);
    System.out.println("White spaces: " + spaces);
  }
}