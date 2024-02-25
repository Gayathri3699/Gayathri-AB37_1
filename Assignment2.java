package assignments;
public class Assignment2
{
	static void add()
	{
		int a=100;
		int b=50;
		int sum=a+b;
		System.out.println(sum);
	}
     static void subtract()
    {
    	int a=55;
    	int b=25;
    	int subtract=a-b;
    	System.out.println(subtract);
    }
    void multi()
	{
	   int a=50;
       int b=20;
       int multi=a*b;
       System.out.println(multi);
	}
	void div()
	{
		int a=80;
		int b=40;
		int div=a/b;
		System.out.println(div);
	}
    public static void main(String[] args) 
	{
    	add();
    	subtract();
       Assignment2 a1=new Assignment2();
       a1.multi();
       a1.div();
	}

}
