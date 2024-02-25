package typecasting;
class excelsheet
{
	void datafetching()
	{
		System.out.println("datafetching");
	}
}
public class Testcase1 extends excelsheet
{
    void login_logout()
    {
    	System.out.println("login logout");
    }
	public static void main(String[] args)
    {
         excelsheet e1 = new Testcase1();//upcasting
         e1.datafetching();
   //downcasting      
         Testcase1 t1 = (Testcase1) e1;//explicit way only
         t1.login_logout();
         t1.datafetching();
	}

}
/*once upcasting is done we will be able to utilise all the
properties of the super class but cannot utilise our own 
properties*/

/*we can access anything that is above but cannot access
that is below*/

