package stringfunctionspractice;

import java.util.Arrays;

public class Practice_Day32
{

	public static void main(String[] args)
	{
 // check if string is palindrome
//read it from front or back it is same		
		String input = "madam";
		String output = "";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char reverse = input.charAt(i);
			output = output+reverse;
		}
		System.out.println(output);
		
			if(input.equals(output))
			{
				//System.out.println("It is a palindrome");
			}
			else
			{
				//System.out.println("It is not a palindrome");
			}
			
//check if the given two string is an anagram of each other
//anagram means 2 strings are made up of same characters			
	String a1 = "listen";
	String a2 = "silent";
	
	if(a1.length()!=a2.length())
	{
		System.out.println("Not an Anagram");
	}
	else
	{
		   char a[] = a1.toCharArray();
		 Arrays.sort(a);
		 System.out.println(   Arrays.toString(a));
		 
		   char s2[] = a2.toCharArray();
		   Arrays.sort(s2);
		   System.out.println(Arrays.toString(s2));
		  System.out.println(Arrays.equals(a, s2));
		  if(Arrays.equals(a, s2))
		  {
			  System.out.println("It is an anagram");
		  }

		 
	}
  
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}


