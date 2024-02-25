package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_63 
{

	public static void main(String[] args) 
	{
	  int number[]= new int[5];
      for(int i =0;i<5;i++)
      {
    	  Scanner s1 = new Scanner(System.in);
    	  number[i] = s1.nextInt();
      }
     System.out.println(Arrays.toString(number)); 
      
   }

}
