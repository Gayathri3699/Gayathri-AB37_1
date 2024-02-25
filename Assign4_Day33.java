package typecasting;
class a2
{
	void login()
	{
		System.out.println("login");
	}
}
class a1 extends a2
{
   void otp()
   {
	  System.out.println("otp"); 
   }
}
public class Assign4_Day33 extends a1
{

	public static void main(String[] args) 
	{
       a1 a = new Assign4_Day33();
       a.login();
       a.otp();
/*once upcasting is done accessing that is below is not possible but
       accessing anything that is above is possible*/
	}

}
