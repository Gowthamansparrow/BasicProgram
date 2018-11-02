package BasicPrograms;

import java.util.Scanner;

public class FindingLeapYear
{

	public static void main(String[] args) 
	{
	
		System.out.println("Enter the year : ");
		Scanner sc = new Scanner(System.in);
		int year=sc.nextInt();
		
		boolean leap = false;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				
				if(year%400==0)
				{
					leap=true;
				}
				else
				{
					leap=false;
				}
			}
			else
			{
				leap=true;
			}
		}
		else
		{
			leap=false;
		}
		
		
		
		if(leap)
		{
			System.out.println("It is leap");
		}
		else
		{
			System.out.println("It is not a leap");
		}
		
		
	}
}
