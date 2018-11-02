package WorkoutBasicProgram;

import java.util.concurrent.SynchronousQueue;

public class Bubblesort
{

	
	static void bubblesort(int[] arr)
	{
		
		int temp=0;
		
		for(int i=1;i<arr.length;i++)
		{
			for(int j=1; j<(arr.length)-1;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		
		
	}
	public static void main(String[] args) 
	{
	
		int[] arr={1,2,3,4,5};
		System.out.println("Before swapping");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i);
		}
		bubblesort(arr);
		System.out.println("After swapping");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i);
		}
		
		
	}
}
