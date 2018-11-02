package WorkoutBasicProgram;

import java.util.Scanner;

public class Primenumber 
{

	
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		boolean prime=true;
		
		for(int i=2; i<num;i++)
		{
			if(num%i==0)
			{
				prime=false;
			}
		}
		if(prime==true)
		{
			System.out.println("prime");
			
		}
		else 
		{
			System.out.println("not prime");
		}
		
		
	}
}
