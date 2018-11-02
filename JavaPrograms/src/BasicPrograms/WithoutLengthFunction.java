package BasicPrograms;

import java.util.Scanner;

public class WithoutLengthFunction 
{

	public static void main(String[] args) 
	{
	
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String s =  sc.nextLine();
		int i=0;
		for(char c:s.toCharArray())
		{
			i++;
		}
		System.out.println("The length is"+s+" "+i);
		
		
	}
}
