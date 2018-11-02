package BasicPrograms;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
	/*
	 a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. 
	 The simplest is the series 1, 1, 2, 3, 5, 8, etc.
	 */
		
		int a=33;
		int b=77;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1 ; i<=10 ; i++)
		{
			int c=a+b;
			System.out.println(c);
			b=c;
			a=b;
		}
		
	}
}
