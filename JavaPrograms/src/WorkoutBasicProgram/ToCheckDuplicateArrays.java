package WorkoutBasicProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ToCheckDuplicateArrays
{

	
	public static void main(String[] args) 
	{
	
		String[] duplicate=new String[] {"Java","Oracle","sql","Java"};
		
		List duplicatelist=Arrays.asList(duplicate);
		Set duplicateset=new HashSet<>(duplicatelist);
		
		if(duplicatelist.size()!=duplicateset.size())
		{
			System.out.println("duplicate");
			
		}
		else
		{
			System.out.println("no duplicate");
		}
		
		
	}
}
