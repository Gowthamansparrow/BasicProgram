package WorkoutBasicProgram;

import java.util.Scanner;

public class AddingArrayElements
{

	
	public static void main(String[] args) 
	{
	
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		System.out.println("Enter the array element");
		
		for(int i=0 ;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0 ; i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
		
	}
}
