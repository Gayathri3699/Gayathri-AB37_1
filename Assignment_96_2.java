package assignments;
//char
class abc
{
	public char getA()
	{
	  return a;	
	}
	public void setA(char a)
	{
		this.a = a;
	}
	private char a = 'm';
}
public class Assignment_96_2
{

	public static void main(String[] args)
	{
         abc a1 = new abc();
         a1.setA('k');
         System.out.println(a1.getA());
	}

}
