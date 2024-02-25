package assignments;
//double
class Wipro
{
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	private double salary = 95.256;
}
public class Assignment_96_4 
{

	public static void main(String[] args) 
	{
       Wipro w1 = new Wipro();
       w1.setSalary(98.568);
       System.out.println(w1.getSalary());
	}

}
