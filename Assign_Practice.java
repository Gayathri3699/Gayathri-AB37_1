package stringfunctionspractice;

import java.util.Date;

public class Assign_Practice 
{
	public static void main(String[]args)
	{
      String m1 = "Books";
      String m2 = "Software";
     //System.out.println(m2.concat(" ").concat(m1));
     
      String m3 = "Software";
      String m4 = "Testing";
      for(int i=0;i<m3.length();i++)
      {
    	 //System.out.println( m3.charAt(i));
      }
      for(int i =0;i<m4.length();i++)
      {
    	 // System.out.println(m4.charAt(i));
      }
      
      String m5 = "MOM";
      String m6 = "DAD";
      
      for(int i=0;i<=2;i++)
      {
    	 // System.out.print(m5.charAt(i));
    	 // System.out.print(m6.charAt(i));
      }
      
      String m7 = "my name is manish";
      for(int i = m7.length()-1;i>=0;i--)
      {
      //System.out.print(m7.charAt(i));
      }
      
//find out the current time of the system
      
      Date d1 = new Date();
      //System.out.println(d1.getTime());
      
      Date d2 = new Date(d1.getTime());//d1.gettime - to invoke the date class constructor
      //System.out.println(d2);
      
     String mydate = d2.toString();// converted to a string now we can use string functions
     //System.out.println(mydate);
     
     String month = mydate.substring(4, 7);
     //System.out.println(month);
     
     String date = mydate.substring(8, 10);
     //System.out.println(date);
     
     String day = mydate.substring(0,3);
     //System.out.println(day);
     
     String year = mydate.substring(24);
     //System.out.println(year);

 //display the date in indian time standard date format
     
     String IST =  date.concat("/").concat(month).concat("/").concat(year);
      System.out.println(IST);
	}

}
