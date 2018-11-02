package WorkoutBasicProgram;

import java.util.Arrays;

public class LargestAndSmallest
{

	public static void main(String[] args) 
	{
		
	
	
	int[] arr={-10,50,33,987,-746};
	
	int large=arr[0];
	int small=arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>large)
		{
			large=arr[i];
		}
		else if(arr[i]<small)
		{
			small=arr[i];
		}
	}
	
	System.out.println(Arrays.toString(arr));
	System.out.println("The largest"+ large);
	System.out.println("The smallest"+small);
	
		
		
	
	
	
	}
	
}
