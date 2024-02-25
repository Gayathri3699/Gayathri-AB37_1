package encapsulation;
//any sensitive information cannot be inside a child class
class ab1
{
	public String getUsername() //this is a getter method
	{
		return Username; //fetched the value
		
//whenever we use return keyword return type cannot be void it should be string		
	}
	
	
	//setter method is to set the new value to my username
	//setting the value is always done with the help of parameters
	public void setUsername(String Username) //this is a setter method
	{
		this.Username = Username;
	}

	private String Username ="arc@grotechminds.com";
}
public class Program1_Day36 
{
	

	public static void main(String[] args)
	{
      ab1 a1 = new ab1();
      a1.setUsername("arch@gmail.com");
      System.out.println(a1.getUsername());
	}

}
