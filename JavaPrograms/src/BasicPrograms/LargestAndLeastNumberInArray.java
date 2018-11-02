package BasicPrograms;

import java.util.Arrays;

public class LargestAndLeastNumberInArray 
{

	public static void main(String[] args) 
	{
	
		int[] number= {-10,24,50,-88,98765};
		
		int largest=number[0];
		int smaller =number[0];
		
		for(int i=1;i<number.length;i++)
		{
			if(number[i]>largest)
			{
				largest=number[i];
			}
			else if(number[i]<smaller)
			{
				smaller =number[i];
			}
		}
		
		System.out.println("Given array is: "+ Arrays.toString(number));
		System.out.println("largest number:" + largest);
		System.out.println("Smallest number: "+ smaller);
		
		
		
		
		
	}
}
