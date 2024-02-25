package inheritence_nonstatic;
class Teacher
{
	void selenium()
	{
		System.out.println("Selenium");
	}
	void java()
	{
		System.out.println("Java");
	}
}
public class Student extends Teacher
{
	void gk()
	{
		System.out.println("General Knowledge");
	}

	public static void main(String[] args) 
	{
       Student s1 = new Student();
       s1.gk();
       s1.java();
       s1.selenium();
	}

}
