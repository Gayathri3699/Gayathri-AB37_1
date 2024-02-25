package assignments;
//int
class Axis
{
	public int getCvv()
	{
		return cvv;
	}
	public void setCvv(int cvv)
	{
		this.cvv = cvv;
	}
	private int cvv = 234;
}
public class Assignment_96_1 
{

	public static void main(String[] args) 
	{
     Axis a1 = new Axis();
     a1.setCvv(969);
    System.out.println(a1.getCvv());
     
	}

}
