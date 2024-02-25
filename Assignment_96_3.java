package assignments;
//boolean
class abc11
{
	public boolean getAnswer()
	{
		return answer;
	}
	public void setAnswer(boolean answer)
	{
		this.answer = answer;
	}
	private boolean answer = true;
}
public class Assignment_96_3 
{

	public static void main(String[] args)
	{
      abc11 a1 = new abc11();
      a1.setAnswer(false);
      System.out.println(a1.getAnswer());
      
	}

}
