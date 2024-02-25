package assignments;
interface State
{
	void Maharashtra(int a);
}
interface city
{
	void Mumbai();
}
interface State1
{
	void AndhraPradesh();

}
interface city1
{
	void Pune();
	
}
public class Country implements State,city,State1,city1
{
	static void India()
	{
		System.out.println("India");
	}

	public static void main(String[] args) 
	{
      India();
      Country c1 = new Country();
      c1.Pune();
      c1.AndhraPradesh();
      c1.Mumbai();
      c1.Maharashtra(20);
      }

	public void Pune() 
	{
		System.out.println("Pune is the cultural capital of Maharashtra");
	}

	public void AndhraPradesh() 
	{
		System.out.println("Andhra Pradesh is also known as kohinoor of India");
	}

	public void Mumbai() 
	{
		System.out.println("Mumbai is the city of dreams");
	}
	public void Maharashtra(int a)
	{
		System.out.println("Maharashtra is famous for its culture and beauty");
	}
}
