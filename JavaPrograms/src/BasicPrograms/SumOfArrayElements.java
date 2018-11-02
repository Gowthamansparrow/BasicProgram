package BasicPrograms;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args)
	{

		int sum=0;
		int[] arr=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array value");
		
		for(int i=0 ;i<arr.length ; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0 ; i<arr.length ; i++)
		{
			sum=arr[i]+ sum;
		}
		
		System.out.println(sum);
		
		
		
	}

}
