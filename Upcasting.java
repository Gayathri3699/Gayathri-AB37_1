package typecasting;
class Upcasting3
{
	void use()
	{
		System.out.println(3);
	}
}
class Upcasting2 extends Upcasting3
{
	void login()
	{
		System.out.println(2);	}
}
class Upcasting1 extends Upcasting2
{
	void logout()
	{
		System.out.println(1);	}
}
public class Upcasting extends Upcasting1
{
	void auth()
	{
		System.out.println(0);
		}

	public static void main(String[] args)
	{
		Upcasting2 u1 = new Upcasting1();	
		u1.login();
		u1.use();
		
	}

}
