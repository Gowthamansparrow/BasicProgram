package BasicPrograms;

import java.util.Scanner;

public class PerfectNumber 
{

	public static void main(String[] args) 
	{
/*  Perfect number means, the numbers Divisor and those numbers addition should give the 
 * same answer
 * eg : 1 , 2 ,3   |   6
 * 		1 + 2 + 3  |   6	
/ */
		
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		int temp=n;
		for(int i=1 ; i<=n/2 ; i++)
		{
			if(n%i==0)
			{
				ans=ans+i;
			}
			System.out.println(ans);
		}
		if(temp==ans)
		{
			System.out.println("Given number is perfect");
		}
		else
		{
			System.out.println("Given number is not perfect");
		}
		
		
		
		
		
		
		
	}
}
