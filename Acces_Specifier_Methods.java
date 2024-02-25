package package1;

public class Acces_Specifier_Methods 
{
  public void add()
  {
	  System.out.println("Addition");
  }
  private void sub()
  {
	  System.out.println("Subtraction");

  }
  protected void mul()
  {
	  System.out.println("Multiplication");

  }
  void div()
  {
	  System.out.println("Division");

  }
	public static void main(String[] args)
	{
		Acces_Specifier_Methods a1 = new Acces_Specifier_Methods();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();

	}

}
