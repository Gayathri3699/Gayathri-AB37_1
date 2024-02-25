package typecasting;
class abc
{
	void excelsheet()
	{
		System.out.println("excelsheet");
	}
}
public class Program2_Day33 extends abc
{
	void loginlogout()
	{
		
	}

	public static void main(String[] args) 
	{
      //upcasting
	  //L.H.S = R.H.S
     
		abc a1  = new Program2_Day33(); 
		a1.excelsheet(); //now we can access only the super class method
//once upcasting is done accessing anything that is below is not possible
	}

}
