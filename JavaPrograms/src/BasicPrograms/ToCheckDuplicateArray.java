package BasicPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ToCheckDuplicateArray 
{

	public static void main(String[] args) 
	{
	
		String[] duplicate= new String[]{"java","oracle","java","c"};
		List duplicateList=Arrays.asList(duplicate);
		Set duplicateSet=new HashSet<>(duplicateList);
		
		if(duplicateList.size()!=duplicateSet.size())
		{
			System.out.println("Contains duplicate");
		}
		else
		{
			System.out.println("No duplicates");
		}
		
	}
}
