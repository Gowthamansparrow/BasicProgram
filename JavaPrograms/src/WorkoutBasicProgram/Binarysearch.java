package WorkoutBasicProgram;

import java.util.Scanner;

public class Binarysearch
{
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		
		int[] arr= new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the searching value");
		int num=sc.nextInt();
		int low=0;
		int high=size-1;
		int mid=0;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]==num)
			{
				System.out.println("Present in mid=="+ mid);
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
			System.out.println("Wrong value");
		}
		
		
		
		
	}

	
	
}
