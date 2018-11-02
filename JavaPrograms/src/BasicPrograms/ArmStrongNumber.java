package BasicPrograms;

import java.util.Scanner;

public class ArmStrongNumber
{

	public static void main(String[] args) 
	{
	/*
		An Armstrong number of three digits is an integer such that the sum of the cubes 
		of its digits is equal to the number itself. 
		For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371. 
		Write a program to find all Armstrong number in the range of 0 and 999.
	*/
		
	
		System.out.println("Enter the value");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		int mod;
		int temp=n;
		
		
		while(n>0)
		{
			mod=n%10;
			ans=ans+mod*mod*mod;
			n=n/10;
		}
		System.out.println("Armstrong number is = "+ ans);
		if(temp==ans)
		{
			System.out.println("Given number is armstrong");
		}
		else
		{
			System.out.println("Given number is not armstrong");
		}
	
	
	
	
	
	
	}
}
