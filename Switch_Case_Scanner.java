package assignments;
import java.util.Scanner;
public class Switch_Case_Scanner 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		
		switch(a)
		{
		case 1: System.out.println("Addition");
		        
		case 2: System.out.println("Subtraction");
		        
		case 3: System.out.println("Multiplication");
		
		case 4: System.out.println("Division");
		        break;
		default: System.out.println("I am the default line");
		}
	}
}
