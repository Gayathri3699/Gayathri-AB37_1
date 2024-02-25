package w3_practice_arrays;

import java.util.Scanner;

public class Table 
{

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Number");

		int mul = s1.nextInt();

       for(int i=1;i<=10;i++)
       {
    	   
         
          System.out.println(mul+" * "+i + " = " + mul*i);
          
    	 
    	  
       }
	}

}
