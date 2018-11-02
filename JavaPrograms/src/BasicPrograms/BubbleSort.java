package BasicPrograms;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
	
		int[] arr={9,8,7,6};
		System.out.println("Before Swapping");
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		
		bubbleSort(arr);
		
		System.out.println("After Swapping");
		for(int i:arr)
		{
			System.out.println(i);
		}
		
	}

	private static void bubbleSort(int[] arr) 
	{
	
		int temp=0;
		
		for(int i=1; i<arr.length ; i++)
		{
			for(int j=1; j<(arr.length)-1 ; j++)
			{
				if(arr[j-1]> arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
					
			}
		}
	}
}
