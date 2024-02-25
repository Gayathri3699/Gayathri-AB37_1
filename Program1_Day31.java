package stringfunctions;

public class Program1_Day31
{

	public static void main(String[] args) 
	{
      int number[] = {10,25,41,52,50};
      int temp = 0;
      int search = 41;
      for(int i =0;i<number.length;i++)
      {
    	  if(search == number[i])
    	  {
    		  System.out.println("Number is present at index:" +i );
    	  }
    	  if(temp == 0)
    	  {
    		  System.out.println("Number is not present at index" +i);
    	  }
    	  
      }
	}

}
