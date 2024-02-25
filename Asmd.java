package assignments;
import java.util.Scanner;
public class Asmd 
{
	public static void main(String[] args)
	{	
		{
		int a,b,sum;
		Scanner s1=new Scanner(System.in);
         a = s1.nextInt();
         b = s1.nextInt();
         sum=a+b;
         System.out.println(sum);
	    }
	    {
         int a,b,sub;
 		Scanner s2=new Scanner(System.in);
          a = s2.nextInt();
          b = s2.nextInt();
          sub=a-b;
          System.out.println(sub);
         }
	    {
	    	Scanner s3 = new Scanner(System.in);
	    	int a = s3.nextInt();
	    	int b = s3.nextInt();
	    	int multi = a*b;
	    	System.out.println(multi);
	    }
	    {
	    	int a,b,div;
	    	Scanner s4 = new Scanner(System.in);
	    	 a = s4.nextInt();
	    	 b = s4.nextInt();
	    	 div = a/b;
	    	System.out.println(div);
	    }
	}
}
