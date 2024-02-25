package assignments;
interface logic3
{
	void login();
}
interface logic2
{
	void url();	
}
abstract class logic1 implements logic2,logic3
{
	abstract void browser();	
}
public class Amazon extends logic1
{
  void web()
  {
	  System.out.println("Amazon Web");
  }
	public static void main(String[] args) 
	{
		Amazon a1 = new Amazon();
		a1.web();
		a1.browser();
		a1.login();
		a1.url();

	}
	
	public void url() 
	{
		System.out.println("logic of url");
	}
	public void login() 
	{
		System.out.println("logic of login");
	}
	void browser() 
	{
		System.out.println("logic of browser");
	}
}
