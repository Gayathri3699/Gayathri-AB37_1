//create an array and copy its value to another array
package arrays;

import java.util.Arrays;

public class Practice2 
{

	public static void main(String[] args) 
	{
      int num[] = new int[4];
      num[0] =10;
      num[1] =50;
      num[2] =30;
      num[3] =25;
      
      int num1[] = new int[4];
      
     for(int i=0;i<4;i++)
   {
	             num1[i] = num[i];
   }
     System.out.println(Arrays.toString(num1)); 
     Arrays.sort(num1);
     System.out.println(Arrays.toString(num1)); 

	}

}
