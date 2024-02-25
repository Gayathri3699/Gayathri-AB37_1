package assignments;
class r2
{
	void login()
	{
		System.out.println("login");
	}
}
class r1 extends r2
{
	void logout()
	{
		System.out.println("logout");
	}
}
public class Assignment_91 extends r1
{
   void otp()
   {
	   System.out.println("otp");
   }
	public static void main(String[] args)
	{
            r1 r =    new Assignment_91();
            r.login();
            r.logout();
          System.out.println(" ");  
           Assignment_91 a1 = (Assignment_91) r;
           a1.login();
           a1.logout();
           a1.otp();
	}

}
