package StarPatterns;

public class SingleHash 
{

	public static void main(String[] args) 
	{
	
		
		
		int n=7;
		int star=7;
		int space=0;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("X");
			}
			if(i<=(n/2))
			{
				space++;
				star-=2;
			}
			else
			{
				space--;
				star+=2;
			}
			System.out.println();
		}
		
	}
}
