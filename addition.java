package assignments;

public class addition 
{
    addition()
    {
    	System.out.println(1);
    }
    addition(int a,int b)
    {
    	System.out.println(2);
    }
    addition(int a, double b)
    {
    	System.out.println(3);
    }
    addition(double a,char b)
    {
    	System.out.println(4);
    }
	public static void main(String[] args) 
{
		new addition();
		new addition(5,10);
		new addition(10,2.1);
		new addition(5.1,'m');

}

}
