package assignments;

public class Assignment3 
{
    static void sample(int a) 
    {
    	System.out.println(a);
	}
    static void sample(double a)
    {
    	System.out.println(a);
    }
    void sample(char a)
    {
    	System.out.println(a);
    }
    void sample(boolean a)
    {
    	System.out.println(a);
    }
    void sample(String a)
    {
    	System.out.println(a);
    }
    
    {
    	System.out.println();
    }
	public static void main(String[] args) 
	{
		sample(50);
		sample(25485.5);
		Assignment3 a1=new Assignment3();
		a1.sample('G');	
		a1.sample(true);
		a1.sample("My name is Archana");
	}

	}


