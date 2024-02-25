package w3_practice_arrays;

public class Palindrome_check 
{

	public static void main(String[] args) 
	{
      String input = "madam";
      String output = "";
      for(int i= input.length()-1;i>=0;i--)
      {
    	  char reverse = input.charAt(i);
    	  output = output+reverse;
      }
      if(input.equals(output))
      {
    	  System.out.println("Its a palindrome");
      }
      else
      {
    	  System.out.println("It's not a palindrome");
      }
	}

}
