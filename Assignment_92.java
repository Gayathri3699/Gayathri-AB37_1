package assignments;
class aa3
{
	void login()
	{
    	System.out.println("login");
	}
}
class aa2
{
	void logout()
	{
    	System.out.println("logout");
	}
}
class aa1 extends aa2
{
	void otp()
	{
    	System.out.println("otp");
	}
}
public class Assignment_92 
{
    void auth()
    {
    	System.out.println("auth");
    }
	public static void main(String[] args)
	{
       aa2 a = new aa1();
       a.logout();
         System.out.println("");
         
         aa1 a1   = (aa1) a;
         a1.otp();
         a1.logout();
        
         
	}

}
