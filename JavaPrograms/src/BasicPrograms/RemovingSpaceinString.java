package BasicPrograms;

import java.util.Scanner;

public class RemovingSpaceinString 
{


	public static void main(String[] args) 
	{
	
		
		
//		for(char ch='E'; ch>='A' ; ch--)
//		{
//			for(char chi='E' ; chi>='A' ; chi--)
//			{
//				System.out.print(chi);
//			}
//			System.out.println();
//		}
		
		
	int space=5;
	
	
	for(int i=1; i<=5; i++)
	{
		for(int j=1 ; j<=i ;j++)
		{
			System.out.print("*");
		}
		for(int k=1 ; k<2*space-1 ; k++)
		{
			System.out.print(" ");
		}
		for(int j=1 ;j<=i ; j++)
		{
			System.out.print("*");
		}
		System.out.println();
		space--;
	}
	
		
	}
	
}
