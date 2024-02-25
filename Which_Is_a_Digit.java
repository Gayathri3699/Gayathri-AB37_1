package stringfunctions23_2_24;

public class Which_Is_a_Digit 
{

	public static void main(String[] args) 
	{
       String name = "kiran407038";
       char[] ch = name.toCharArray();
       
       for(int i=0;i<name.length();i++)
       {
    	  boolean ans = Character.isDigit(ch[i]);
    	  if(ans== true)
    	  {
    		  System.out.println(ch[i] +" is a digit");
    	  }
    	  else
    	  {
    		  System.out.println(ch[i] +" is a character");
    	  }
       }
	}

}
