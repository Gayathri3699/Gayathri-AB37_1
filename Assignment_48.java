package assignments;
class a1
{
	static void add()
	{
		System.out.println("logic of add");
	}
	void sub()
	{
		System.out.println("logic of sub");
	}
}
abstract class a2 extends a1
{
	abstract void multi();
	abstract void div();
}
public class Assignment_48 extends a2
{
	static void login()
	{
		System.out.println("logic of login");
	}
	void logout()
	{
		System.out.println("logic of logout");
	}
   public static void main(String[] args) 
   {
	    
	  Assignment_48 a1 = new Assignment_48();
	  a1.div();
	  a1.sub();
	  a1.logout();
	  a1.multi();
	  login();
	  add();
	  
   }
void multi() 
{
	System.out.println("logic of multi");
}
void div() 
{
	System.out.println("logic of div");
}
}
