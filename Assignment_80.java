package assignments;
public class Assignment_80 
{
	public static void main(String[] args) 
	{
      String name = "kiran123";
      char c[] = name.toCharArray();
      for(int i =0;i<name.length();i++)
      {
    	  boolean answer = Character.isDigit(c[i]);
    	  if(answer ==true)
    	  {
    		  System.out.println("digit is present at index:"+i);
    	  }
      }     
	}
}
