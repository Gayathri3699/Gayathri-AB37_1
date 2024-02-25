package assignments;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment_61 
{
   static void add() throws ArithmeticException,InputMismatchException
   {
	   System.out.println("a1");
   }
	public static void main(String[] args) 
	{
		
      try
      {
    	 Scanner s1 = new Scanner(System.in);
    	 int c = 1;
    	 int a = s1.nextInt();
    	 System.out.println(c);
      }
      catch(InputMismatchException a)
      {
    	  System.out.println("It's and InputMismatchException,have handled it");
      }
      catch(ArithmeticException b)
      {
    	  System.out.println("It's an ArithmeticException,have handled it");
      }
	}
}
