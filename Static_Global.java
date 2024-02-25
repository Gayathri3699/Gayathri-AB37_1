package typesofvariables;
public class Static_Global 
{
	static int a;
	static int b;
	static void subtract()
	{
		a=10;
		b=20;
	  int subtract=a-b;
	  System.out.println(subtract);
	}	   
	static void add()
	{
		a=40;
		b=50;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		subtract();
		add();
	}

}
