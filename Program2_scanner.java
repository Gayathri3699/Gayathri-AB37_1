package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program2_scanner 
{

	public static void main(String[] args)
	{
       Scanner s1 = new Scanner(System.in);
       try
       {
       int number = s1.nextInt();
       int c =1/0;
       System.out.println(c);
       }
       catch(InputMismatchException a1)
       {
    	   System.out.println("nextint can store only numeric values");
       }
       catch(ArithmeticException a1)
       {
    	   System.out.println("Its an arithmetic exception,have handled it");
       }
	}

}
