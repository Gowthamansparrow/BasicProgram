package BasicPrograms;

import java.util.Scanner;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the values for array");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] =sc.nextInt();
		}
		System.out.println("Enter the value to be searched");
		int num=sc.nextInt();
		
	
		int low=0;
		int high=size-1;
		int mid=0;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]==num)
			{
				System.out.println("Value is present at "+ mid);
				break;
			}
			else if(arr[mid]>num)
			{
				high=mid-1;
			}
			else if(arr[mid]<num)
			{
				low=mid+1;
			}
			
			
		}
		if(low>high)
		{
			System.out.println("the number is not present in the array");
		}
		
		
		
		
		
		
		
		
	}
}
