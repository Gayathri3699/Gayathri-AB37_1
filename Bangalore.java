package package1;
public class Bangalore 
{
	int age;
	String Name;
	
	 void student(int age,String Name)
	{
		this.age=age;
		this.Name = Name;
		System.out.println("i am student");
	}
	
    public static void main(String[] args)
    { 
    	Bangalore b1 = new Bangalore();
    	b1.student(23,"Ram");
    	System.out.println(b1.age);
    	System.out.println(b1.Name);
    	
    	
    	
    }

	

}
