package w3_practice_arrays;
class ar1
{
	void mul()
	{
		System.out.println("1");
	}
}
class archana11 extends ar1
{
	void add()
	{
		System.out.println("2");

	}
}
public class Multilevel_Inheritance extends archana11
{
	void sub()
	{
		System.out.println("3");

	}

	public static void main(String[] args)
	{
		Multilevel_Inheritance m1 = new Multilevel_Inheritance();
		m1.add();
		m1.mul();
		m1.sub();
	}

}
