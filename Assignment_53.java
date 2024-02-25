package assignments;
interface disney3
{
	void otp();
}
interface disney2
{
	void auth();
}
interface disney1
{
	void login();
}
interface disney
{
	void logout();
}
public class Assignment_53 implements disney,disney1,disney2,disney3
{

	public static void main(String[] args)
	{
       Assignment_53 a1 = new Assignment_53();
       a1.auth();
       a1.login();
       a1.logout();
       a1.otp();
       
	}

	public void otp() 
	{
		System.out.println("logic of otp");
	}

	public void auth() 
	{
		System.out.println("logic of auth");
	}

	public void login()
	{
		System.out.println("logic of login");
	}

	public void logout()
	{
		System.out.println("logic of logout");
	}

}
