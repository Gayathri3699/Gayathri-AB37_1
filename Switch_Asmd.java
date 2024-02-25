package assignments;
import java.util.Scanner;
public class Switch_Asmd 
{
	public static void main(String[] args)
	{ 
         Scanner s1 = new Scanner(System.in);
         int a = s1.nextInt();
         int b = s1.nextInt();
         int c = s1.nextInt();
         
         int sum   =b+c;
         int sub   =b-c;
         int multi = b*c;
         int div   = b/c;
         
         switch(a)
         {
         case 1: System.out.println(sum);
                  
         case 2: System.out.println(sub);
                  
         case 3: System.out.println(multi);
                  
         case 4: System.out.println(div);
                 break;
         }
         
	}
}
