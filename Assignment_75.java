//create an array of length 4 of int data type,find 41 is present or not in array
package assignments;

public class Assignment_75 
{

	public static void main(String[] args)
	{
      int number[] = {20,41,50,30};
      int temp = 0;
      int find = 41;
      for (int i=0;i<4;i++)
      {
    	  if(find == number[i])
    	  {
    		  System.out.println("Number is present at index:" +i);
    		  find++;
    	  }
      
    	  if(find == 0)
    	  {
    		  System.out.println("Number not found in an array");
    	  }
   
      }
      
      
	}
}

