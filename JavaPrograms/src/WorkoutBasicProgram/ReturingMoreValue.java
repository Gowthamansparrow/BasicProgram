package WorkoutBasicProgram;

public class ReturingMoreValue 
{

	static int[] returningMethod(int a , int b)
	{
		int[] arr= new int[2];
		arr[0]=a+b;
		arr[1]=a-b;
		
		return arr;
		
	}
	
	public static void main(String[] args) 
	{

		int[] ret=returningMethod(4,5);
		System.out.println(ret[0]);
		System.out.println(ret[1]);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
