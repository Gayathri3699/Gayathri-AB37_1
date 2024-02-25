package assignments;
import java.util.Scanner;
public class Asmd_Global_Scanner
{
   Scanner s1 = new Scanner(System.in);
	int a = s1.nextInt();
	int b = s1.nextInt();
	void asmd()
	{
	int sum    = a+b;
	int sub    = a-b;
	int multi  = a*b;
	int div    = a/b;
	{
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(multi);
		System.out.println(div);
	}
	}
	
	public static void main(String[] args)
	{
		Asmd_Global_Scanner a1 = new Asmd_Global_Scanner();
		a1.asmd();
	}

}
