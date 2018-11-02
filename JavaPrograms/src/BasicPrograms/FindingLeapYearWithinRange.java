package BasicPrograms;

import java.util.Scanner;

public class FindingLeapYearWithinRange 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the First year");
		int firstYear=sc.nextInt();
		System.out.println("Enter the last year");
		int lastYear=sc.nextInt();
		
		for(int year=firstYear ;year<=lastYear; year++ )
		{
			boolean leap=false;
		
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
				System.out.println("years :" + year );
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}
}
