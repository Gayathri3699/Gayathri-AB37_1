package assignments;
interface ab2
{
	void otp();
}
interface ab1
{
	void auth();
}

public class Assignment_52 implements ab1,ab2
{

	public static void main(String[] args) 
	{
      Assignment_52 a1 = new Assignment_52();
      a1.auth();
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

}
