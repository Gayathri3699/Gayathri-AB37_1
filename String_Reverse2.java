package stringfunctionspractice;
//reverse a string name manish
public class String_Reverse2 
{

	public static void main(String[] args) 
	{
      String input = "manish";
      String output = "";
      for(int i=input.length()-1;i>=0;i--)
      {
    	  char reverse = input.charAt(i);
    	  System.out.println(reverse);
      }
	}
//in this case string is input and the output is in char
}
