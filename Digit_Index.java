package stringfunctions23_2_24;

public class Digit_Index 
{

	public static void main(String[] args) 
	{
       String name = "kiran407038";
       char[] ch = name.toCharArray();
       
       for(int i=0;i<name.length();i++)
       {
    	  boolean ans = Character.isDigit(ch[i]);
    	  if(ans == true)
    	  {
    		  System.out.println("Number is present at index: " +i);
    	  }
       }
	}

}
