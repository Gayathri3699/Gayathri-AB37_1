package assignments;

public class Constructor4_1IIB 
{
	Constructor4_1IIB ()
	{
		System.out.println("I am constructor 1");
	}
	Constructor4_1IIB (int a)
	{
		System.out.println("I am constructor 2");
	}
	Constructor4_1IIB (double b)
	{
		System.out.println("I am constructor 3");
	}
	Constructor4_1IIB (char c)
	{
		System.out.println("I am constructor 4");
	}
	
	{
		System.out.println("I am IIB");
	}
	public static void main(String[] args) 
	{
		new Constructor4_1IIB ();
		new Constructor4_1IIB (20);
		new Constructor4_1IIB (2.1);
		new Constructor4_1IIB ('v');
	}
}
