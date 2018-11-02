package WorkoutBasicProgram;

import java.util.Scanner;

public class Lengthfunction 
{

	public static void main(String[] args) 
	{
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int i=0;
		for(char c:s.toCharArray())
		{
			i++;
		}
		System.out.println(i);
		
		
		
		
		
		
	}
}
