package BasicPrograms;

import java.util.Scanner;

public class ToCheckStringPalindrome
{

	public static void main(String[] args) 
	{
	
	String reverse="";
	System.out.println("Enter the string");
	Scanner sc = new Scanner(System.in);
	String original=sc.nextLine();
	for(int i=original.length()-1 ; i>=0;i--)
	{
		reverse = reverse+ original.charAt(i);
		
	}
	
	
	if(original.equals(reverse))
	{
		System.out.println("String is palindrome");
	}
	else
	{
		System.out.println("Not a palindrome");
	}
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
	}
	
	
}
