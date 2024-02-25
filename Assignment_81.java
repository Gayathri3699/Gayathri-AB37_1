package assignments;
public class Assignment_81 
{
	public static void main(String[] args)
	{
      String name = "rahul123";
      char c[] = name.toCharArray();
      int count = 0;
      int temp = 0;
      for(int i =0;i<name.length();i++)
      {
    	  
    	  boolean answer = Character.isDigit(c[i]);
    	  if(answer == true)
    	  {  		  
    		  count++;
    	  }
    	  else
    	  {
    		  temp++;
    	  }    	   
      }
      System.out.println("Number of Digits are:"+ count);
      System.out.println("Number of Characters are:"+ temp);

	}

	

}
