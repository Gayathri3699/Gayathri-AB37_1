package assignments;
interface logic_a4
{
	void login();
}
interface logic_a3
{
	void logout();
}
interface logic_a2
{
	void auth();
}

public class Logic_a1 implements logic_a2,logic_a3,logic_a4
{
	static void otp()
	{
		System.out.println("logic of otp");
		
	}

	public static void main(String[] args) 
	{
      otp();
      Logic_a1 l1 = new Logic_a1();
      l1.auth();
      l1.login();
      l1.logout();
	}
	public void login()
	{
		System.out.println("logic of login");
	}
	public void logout()
	{
		System.out.println("logic of logout");
	}
	public void auth()
	{
		System.out.println("logic of auth");
	}

}
