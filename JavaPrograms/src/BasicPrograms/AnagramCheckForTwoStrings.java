package BasicPrograms;

import java.util.Arrays;

public class AnagramCheckForTwoStrings
{

	public static void main(String[] args) 
	{
	
		String str1 = "Java";
		String str2= "avaJ";
		
		System.out.println("Both Strings are Anagram =="+ anagramCheck(str1,str2));
		
		
	}
	
	public static boolean anagramCheck(String str1 , String str2)
	{
		char[] firstName=str1.toCharArray();
		char[] secondName=str2.toCharArray();
		
		Arrays.sort(firstName);
		Arrays.sort(secondName);
		
		return Arrays.equals(firstName,secondName);
		
	}
	
	
}
