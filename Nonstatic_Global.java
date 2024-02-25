package typesofvariables;

public class Nonstatic_Global 
{
	int a;
	int b;
	void subtract()
	{
		a=50;
		b=30;
		int subtract=a-b;
		System.out.println(subtract);
	}

	void add()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Nonstatic_Global n1=new Nonstatic_Global();
		n1.subtract();
		n1.add();
	}

}
