package w3_practice_arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Math_class 
{

	public static void main(String[] args) 
	{
       try
       {
    	  String a = null;
       }
       catch(ArithmeticException a1)
       {
    	   System.out.println("It's an arithmetic exception");
       }
       catch(InputMismatchException i1)
       {
    	   System.out.println("It's an Inputmismatch exception");

       }
       catch(ArrayIndexOutOfBoundsException n1)
       {
    	   System.out.println("It's an ArrayIndexOutOfBounds exception");

       }
       catch(NullPointerException n1)
       {
    	   System.out.println("It's a NullPointerException");
       }
	}

}
