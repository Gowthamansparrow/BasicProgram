package BasicPrograms;

public class PrintingwithoutLoop 
{
	
	/* RECURSIVE METHOD  */

	static void printnumber(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printnumber(num);
		}
	}
	
			
	public static void main(String[] args) 
	{
	
		printnumber(1);
		
	}
}
