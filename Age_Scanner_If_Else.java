package assignments;
import java.util.Scanner;
public class Age_Scanner_If_Else 
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		int age = s1.nextInt();
		if (age>=18)
		{
			System.out.println("I am adult");
		}
		else
		{
			System.out.println("I am young");
		}		 
	}
}
