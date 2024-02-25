package assignments;
interface Logic_c
{
	void add();
}
interface Logic_b 
{
	void sub();
}
abstract class Logic_a implements Logic_b,Logic_c
{
	abstract void multiply();	
}
public class Logic extends Logic_a
{
	static void div()
	{
		System.out.println("logic of division");
	}

	public static void main(String[] args) 
	{
      div();
      Logic l1 = new Logic();
      l1.sub();
      l1.add();
      l1.multiply();
	}	
	public void sub() 
	{
		System.out.println("logic of sub");
	}
	public void add() 
	{
		System.out.println("logic of add");
	}
	void multiply() 
	{
		System.out.println("logic of multiply");
	}

}
