package exception_handling;

public class Program_1 
{

	public static void main(String[] args) 
	{
		try
		{
                int c = 1/1;
                System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("int cannot store infinity, so have handled it");
		}
		
	}

}
