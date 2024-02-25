package inheritence_multilevel;
class Three
{
	void Java()
	{
		System.out.println("Java");
	}
}
class Two extends Three
{
	void Selenium()
	{
		System.out.println("Selenium");
	}	
}
public class One extends Two
{
	void Gk()
	{
		System.out.println("General Knowledge");
	}
	public static void main(String[] args) 
	{
       One o = new One();
       o.Gk();
       o.Selenium();
       o.Java();
	}
}
