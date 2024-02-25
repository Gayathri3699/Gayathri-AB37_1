package assignments;

public class Throw_Keyword 
{

	public static void main(String[] args) throws ArithmeticException
	{
      int age = 18;
      if(age<18)
      {
    	  System.out.println("Allow to visit Google.com");
      }
      else 
      {
    	  throw new ArithmeticException("its and arithmetic exception");
      }
	}

}
