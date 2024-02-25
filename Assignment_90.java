package assignments;
class c2
{
	void login()
	{
		System.out.println("login");
	}
}
class c1 extends c2
{
	void logout()
	{
		System.out.println("logout");
	}
}
public class Assignment_90 extends c1
{
	void otp()
	{
		System.out.println("otp");
	}
	public static void main(String[] args) 
	{
      c2 c =  new Assignment_90();//upcasting
      c.login();
      
     Assignment_90 a1 =  ( Assignment_90) c;
     a1.login();
     a1.logout();
     a1.otp();
//once upcasting is done anything that is below cannot be accessed      
}
}
