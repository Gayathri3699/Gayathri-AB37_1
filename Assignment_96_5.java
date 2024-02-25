package assignments;
//String
class sbi
{
	private String name = "Archana";

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
}
public class Assignment_96_5 
{

	public static void main(String[] args) 
	{
      sbi s1 = new sbi();
      s1.setName("Gayathri");
      System.out.println(s1.getName());
	}

}
