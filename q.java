package package1;

class Three1
{
	void selenium()
	{
		System.out.println("selenium");
	}
}
class Two1 extends Three1
{
	void java()
	{
	  System.out.println("java");	
	}
}

class One1 extends Three1
{
	void gk()
	{
		System.out.println("General Knowledge");
	}
   
	public static void main(String[] args) 
	{ 
      		One1 o1 = new One1();
      		o1.gk();
      		o1.selenium();
      		
	}
  

}
