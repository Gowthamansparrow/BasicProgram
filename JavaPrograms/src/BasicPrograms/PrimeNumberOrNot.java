package BasicPrograms;

import java.util.Scanner;

public class PrimeNumberOrNot
{

	public static void main(String[] args) 
	{
		boolean prime=true;
	System.out.println("Enter the number :");
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	
	for(int i=2 ; i<num; i++)
	{
		if(num%i==0)
		{
			prime=false;
		}
	}
	
	if(prime==true)
	{
		System.out.println("Is a prime number");
		
	}
	else
	{
		System.out.println("Not a Prime number");
	}
		
		
	}
}
