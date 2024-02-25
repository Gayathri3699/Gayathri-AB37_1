package typecasting;
//upcasting
class ar2 
{
	void login()
	{
		System.out.println("login");
	}
}
class ar1 extends ar2
{
	void logout()
	{
		
	}
}

public class Assign3_Day33 extends ar1
{
	void otp()
	{
		
	}

	public static void main(String[] args) 
	{
		ar2 a1 = new Assign3_Day33();
		a1.login();
//once upcasting is done anything that is below it cannot be accessed
		
	}

}
