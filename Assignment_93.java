package assignments;
//day34 problem 5 upcasting and downcasting
class New1
{
	void auth()
	{
		System.out.println("auth");
	}
}
class New2 extends New1
{
	void otp()
	{
		System.out.println("otp");

	}
}
class New3 extends New2
{
	void login()
	{
		System.out.println("login");

	}
}
public class Assignment_93 extends New3
{
	void cvv()
	{
		System.out.println("cvv");

	}

	public static void main(String[] args) 
	{
                        New2 n1 = new  New3();   
                        n1.auth();
                     System.out.println("");   
                        New3 n = (New3) n1;
                        n.auth();
                        n.login();
                        n.otp();
                        
                        
	}

}
