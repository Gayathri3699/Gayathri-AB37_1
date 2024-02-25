package assignments;
interface ac
{
	void otp();
}
abstract class ab implements ac
{
	abstract void login();
	void logout()
	{
		System.out.println("logic of logout");
	}
}
public class Assignment_51 extends ab
{

	public static void main(String[] args)
	{
      Assignment_51 a1 = new Assignment_51();
      a1.login();
      a1.logout();
      a1.otp();
	}

	public void otp() 
	{
       System.out.println("logic of otp");		
	}

	void login()
	{
       System.out.println("logic of login");		
	}

}
