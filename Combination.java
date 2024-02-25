package package1;

public class Combination 
{
	Combination()
	{
	   System.out.println("I am a constructor");	
	}
	static
	{
		System.out.println("I am SIB");
	}
	{
		System.out.println("I am IIB");
	}
	public static void main(String[] args) 
	{
        System.out.println("I am Main Method");
        Combination c1=new Combination();
	}

}
