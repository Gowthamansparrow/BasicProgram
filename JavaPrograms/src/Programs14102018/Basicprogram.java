package Programs14102018;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Basicprogram 
{


	
	
	
	
	public static void main(String[] args) 
	{
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the size value");
		int size =sc.nextInt();
		int[] arr= new  int[size];
		
		System.out.println("Enter the value");
		for(int i=0; i<=arr.length ; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the value to search");
		int num=sc.nextInt();
		int low=0;
		int high=size-1;
		int mid=0;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]==num)
			{
				System.out.println();
			}
		}
		
		
		
		
		
		
	}
	
}
