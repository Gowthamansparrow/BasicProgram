package BasicPrograms;

import java.util.Scanner;

public class TransposeMatrix 
{

	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of row");
		int row=sc.nextInt();
		System.out.println("Enter the size of col");
		int col = sc.nextInt();
		
		int[][] arr=new int[row][col];
		
		System.out.println("Enter the matrix values");
		for(int i=0 ; i<row ;i++)
		{
			for(int j=0 ; j<col ; j++)
			{
				arr[i][j]=sc.nextInt();
			}
				
		}
		
		int[][] transpose=new int[row][col];
		for(int i=0 ;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				transpose[j][i]=arr[j][i];
				
			}
		}
		System.out.println("transpose of the given num is");
		for(int i=0 ;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(transpose[j][i]);
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
