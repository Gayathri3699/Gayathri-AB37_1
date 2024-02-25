package assignments;
interface Amazon1
{
    void login();
	void logout();	
}
public class Assignment_49 implements Amazon1
{

	public static void main(String[] args) 
	{
         Assignment_49 a1 = new Assignment_49();
         a1.login();
         a1.logout();
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
