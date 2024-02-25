package arrays;

import java.util.Scanner;

public class Scanner_Array_Assign 
{

	public static void main(String[] args) 
	{
        int num[] = new int[5];
        Scanner s1 = new Scanner(System.in);
        num[0]=s1.nextInt();
        num[1]=s1.nextInt();
        num[2]=s1.nextInt();
        num[3]=s1.nextInt();
        num[4]=s1.nextInt();
        for(int i=0;i<5;i++)
        {
        	System.out.println(num[i]);
        }
        
	}

}
