package assignments;

public class Nonstatic
{
    void lunch()
    {
    	System.out.println("i did not have my lunch");
    }
	public static void main(String[] args) 
	{
         Nonstatic n1=new Nonstatic ();
         n1.lunch();
        		 
	}

}
