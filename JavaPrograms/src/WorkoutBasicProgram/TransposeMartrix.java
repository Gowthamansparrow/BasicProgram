package WorkoutBasicProgram;

import java.util.Scanner;

public class TransposeMartrix 
{

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row =");
		int row=sc.nextInt();
		System.out.println("Enter the col=");
		int col=sc.nextInt();
		
		int[][] arr= new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		int[][] transpose=new int[row][col];
		
		for(int i=0;i<col;i++)
		{
			for(int j=0; j<row;j++)
			{
				transpose[j][i]=arr[i][j];
			}
		}
		
		System.out.println("The transpose is");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(transpose[j][i]);
			}
		}
		
		
		
		
		
	}
}
