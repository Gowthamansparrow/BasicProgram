package WorkoutBasicProgram;

import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args) 
	{
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the start year");
		int f_year=sc.nextInt();
		System.out.println("Enter the last year");
		int l_year=sc.nextInt();
		boolean leap=true;
		
		for(int year=f_year ; year<=l_year ; year++)
		{
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
				leap= false;
			}
		
		System.out.println(year);
		if(leap)
		{
			System.out.println("the year is :"+ year);
		}
		}
	}
}
