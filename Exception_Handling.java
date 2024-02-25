package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling 
{
  /*exception handling can be done using try and catch block exception line is written
	inside an try block and handled inside a catch block*/
	public static void main(String[] args) 
	{
		
       try//if there is no exception try block will execute
       {
    	   Scanner s1 = new Scanner(System.in);
   		   int c = s1.nextInt();
    	   int a = s1.nextInt();  
       }
       catch(InputMismatchException a1)//if there is an exception any one of the catch block will be executed from many catch blocks
       {
    	   System.out.println("It's an InputMismatch Exception, i have handled it");
       }
       catch(ArithmeticException a2)
       {
    	   System.out.println("It's an Arithmetic Exeption, i have handled it");
       }
       finally//finally block is not mandatory it will execute even if the exception is there or not
       {
    	   System.out.println(" i am a finally block");
       }
       
	}

}
