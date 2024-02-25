package typecasting;
class Upcasting003
{
	void add()
	{
		System.out.println("add");
	}
}
class Upcasting002 extends Upcasting003
{
	void sub()
	{
		System.out.println("sub");

	}
}
class Upcasting001 extends Upcasting002
{
	void mul()
	{
		System.out.println("mul");

	}
}
public class Upcasting01 extends Upcasting001
{
	void div()
	{
		System.out.println("div");

	}

	public static void main(String[] args)
	{
		Upcasting002 u1 = new Upcasting001();
		u1.sub();
		u1.add();
		
		Upcasting01 u2 =(Upcasting01)u1;
		u2.add();
		u2.sub();
		u2.mul();
		u2.div();
		
	}

}
