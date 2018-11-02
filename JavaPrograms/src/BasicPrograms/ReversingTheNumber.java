package BasicPrograms;

import java.util.Scanner;

public class ReversingTheNumber 
{

	public static void main(String[] args) 
	{
	
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int mod;
		
		while(n>0)
		{
			mod=n%10;
			sum=sum*10 +mod;
			n=n/10;
		}
		System.out.println("The Reverse is="+ sum);
	}
}
