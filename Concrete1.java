package assignments;
class Concrete2
{
	static void add()
	{
		System.out.println("Addition");
	}
	void sub()
	{
		System.out.println("Subtraction");
	}
}
abstract class Abstract_Class extends Concrete2
{
	abstract void multiply();
	abstract void division();
}

public class Concrete1 extends Abstract_Class
{
	static void java()
	{
		System.out.println("Java");
	}
	static void selenium()
	{
		System.out.println("Selenium");
	}

	public static void main(String[] args)
	{
      java();
      selenium();
      add();
      Concrete1 c1 = new Concrete1();
      c1.sub();
      c1.multiply();
      c1.division();
	}		
	void multiply()
	{
		System.out.println("multiply");
	}

	void division() 
	{
		System.out.println("division");
	}
}

