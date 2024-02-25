package assignments;
class Amazon11
{
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	private String name = "contact@grotechminds.com";
}
public class Assignment_95
{

	public static void main(String[] args) 
	{
       Amazon11 a1 = new Amazon11();
       a1.setName("archana999@gmail.com");
       System.out.println(a1.getName());
	}

}
