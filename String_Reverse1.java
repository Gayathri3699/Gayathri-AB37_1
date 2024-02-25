package stringfunctionspractice;
//reverse a string "manoj"

public class String_Reverse1
{

	public static void main(String[] args) 
	{
      String name = "manoj";
     
      //1st way to reverse a string
      
      for(int i =name.length()-1;i>=0;i--)
      {
    	 System.out.print( name.charAt(i));
      }
      
      
	}

}
