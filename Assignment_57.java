package assignments;

public class Assignment_57 
{
	public  static void add()
	{
		System.out.println("public access specifier");
	}
	private static void sub()
	{
		System.out.println("private access specifier");
	}
	protected static void div()
	{
		System.out.println("protected access specifier");
	}
	static void mul()
	{
		System.out.println("default access specifier");
	}

	public static void main(String[] args)
	{
      add();
      sub();
      mul();
      div();
	}

}
