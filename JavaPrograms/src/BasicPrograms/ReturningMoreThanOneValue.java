package BasicPrograms;

public class ReturningMoreThanOneValue 
{
	
	static int[] number(int a ,int b)
	{
		int[] arr=new int[2];
		arr[0]=a+b;
		arr[1]=a-b;
		return arr;

	}
	public static void main(String[] args) 
	{
	
		int[] ans=number(3,6);
		
		
		
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		
		
	}
		
}

