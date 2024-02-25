package encapsulation;
class Amazon
{
	public int getCvv()
	{
		return cvv;
	}
	public void setCvv(int cvv)
	{
		this.cvv = cvv;
	}
	int cvv = 932;
}

public class Program2_Day37 
{
	public static void main(String[] args) 
	{
		 Amazon a1 = new Amazon();
		 a1.setCvv(239);
		 System.out.println(a1.getCvv());			 
	}

}
