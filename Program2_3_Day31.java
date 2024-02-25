package stringfunctions;

import java.util.Arrays;

public class Program2_3_Day31 
{

	public static void main(String[] args)
	{
      String a = "gayathri";
      String b = "gayathri";
     System.out.println(a.matches(b)); 
      //Program 2 of day31
     String name[] = {"ram","sita","laxman"};
     String studentname[] = {"ram","sita","laxman"};
     System.out.println(Arrays.equals(name, studentname));
     //program 3 of day 31
     int rollnumber[] = {20,25,35,50};
     int studentrollnumber[] = {20,21,35,50};
    boolean check = Arrays.equals(rollnumber, studentrollnumber);
    System.out.println(check);
	}

}
