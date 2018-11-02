package BasicPrograms;

import java.util.Scanner;

public class Palindrome 
{
private static Scanner sc;

public static void main(String[] args) 
{

	//  sequence that reads the same backwards as forwards
	
	
	System.out.println("Enter the number");
	sc = new Scanner(System.in);
	int n=sc.nextInt();
	int ans=0;
	int mod;
	int temp=n;
	
	while(n>0)
	{
		mod=n%10;
		ans=ans*10+mod;
		n=n/10;
		
	}
	
	System.out.println("The palindrome value is = "+ ans);
	
	if(temp==ans)
	{
		System.out.println("Given num is palindrom");
	}
	else
	{
		System.out.println("Given num is not palindrom");
	}
	
	
}
}
