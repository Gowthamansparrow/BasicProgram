package BasicPrograms;

public class ProductOf5Numbers 
{

	public static void main(String[] args) 
	{
	
		int prod=1;
		for(int i=2 ; i<=10 ; i+=2)
		{
			prod=prod*i;
			
		}
		System.out.println(prod);
	}
}
