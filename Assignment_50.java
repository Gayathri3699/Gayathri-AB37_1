package assignments;
interface Abc2
{
	void auth1();
	void twowayauth();
}
interface Abc1 extends Abc2
{
	void otp();
	void auth();
}
public class Assignment_50 implements Abc1
{

	public static void main(String[] args) 
	{
       Assignment_50 a1 = new Assignment_50();
       a1.auth();
       a1.auth1();
       a1.twowayauth();
       a1.otp();
       
	}

	public void twowayauth() 
	{
     	System.out.println("logic of twowayauth");
	}

	public void otp()
	{
		System.out.println("logic of otp");
	}

	public void auth() 
	{
		System.out.println("logic of auth");
	}

	public void auth1() 
	{
      	System.out.println("logic of auth1");	
	}

	

}
