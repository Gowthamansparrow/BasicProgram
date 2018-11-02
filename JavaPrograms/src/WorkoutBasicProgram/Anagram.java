package WorkoutBasicProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{

	static boolean anagram(String st1,String st2)
	{
		
		char[] first=st1.toCharArray();
		char[] second=st1.toCharArray();
		
		Arrays.sort(first);
		Arrays.sort(second);
		
		return Arrays.equals(first, second);
		
	}
	
	
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st string");
		String st1=sc.nextLine();
		System.out.println("Enter the 2nd string");
		String st2=sc.nextLine();
		
		
		
		System.out.println("both are strings");
		
		
		
		
		
	}
	
}
