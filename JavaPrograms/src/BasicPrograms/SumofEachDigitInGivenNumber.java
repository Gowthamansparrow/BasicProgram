package BasicPrograms;

import java.util.Scanner;

public class SumofEachDigitInGivenNumber 
{

	public static void main(String[] args) 
	{
	
		int sum=0;
		int mod;
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		while(n>0)
		{
			mod=n%10;
			sum=sum+mod;
			n=n/10;
			
		}
		
		System.out.println("Sum of given Number ="+ sum);
		
		
		
	}
}
