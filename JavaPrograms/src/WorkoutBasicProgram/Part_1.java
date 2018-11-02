package WorkoutBasicProgram;

import java.util.Scanner;

public class Part_1 
{

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int ans=0;
		int temp=n;
		
		for(int i=1; i<=n/2 ; i++)
		{
			if(n%i==0)
			{
				ans=ans+i;
			}
			System.out.println(ans);
		}
		if(temp==ans)
		{
			System.out.println("Perfect");
		}
		else
		{
			System.out.println("not perfect");
		}
		
		
	}
	
}
