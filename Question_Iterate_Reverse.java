package arrays;

public class Question_Iterate_Reverse
{
//create an array of 3 and iterate it to another array in a reverse order
	public static void main(String[] args) 
	{
      int a [] = new int[3];
      a[0] = 10;
      a[1] = 20;
      a[2] = 30;
      
      int b[] = new int[3];
      
    // b[0] = 30;
    // b[1] = 20;
    // b[2] = 10;
      
     // for(int i=2;i>=0;i--)
      for(int i=a.length-1;i>=0;i--)
      {
    	  b[i] = a[i];
    	  System.out.println(b[i]);	
    	 
      }
    	
	}

}
