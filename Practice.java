package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practice 
{

	public static void main(String[] args)
	{
	   Scanner s1 = new Scanner(System.in);
       int ar[] = new int[5];
       
       for(int i=0;i<5;i++)
       {
    	  
    	  System.out.println("Enter the value of index " +i);
    	 ar[i] = s1.nextInt() ;
    	 System.out.println(ar[i]);
       }
      
       System.out.println(Arrays.toString(ar));
       Arrays.sort(ar);//only same datatypes can be sorted
       System.out.println(Arrays.toString(ar));
 //Arrays.tostring(datatype) is used to print the arrays in a string      
	}

}
