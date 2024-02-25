package stringfunctions;
//ASSIGNMENT 71
import java.util.Date;
public class Current_Date 
{
	public static void main(String[] args) 
	{
      Date d1 = new Date ();
     System.out.println(d1.getTime()); 
     
     Date d2 = new Date(d1.getTime());                   
     System.out.println(d2);
     String mydate = d2.toString();
     
     String date = mydate.substring(8, 10);
     System.out.println(date);//date
     
     String Year = mydate.substring(24);
     System.out.println(Year);//year
     
     String day = mydate.substring(0,3);
     System.out.println(day);//day
     
     String month = mydate.substring(4, 7);
     System.out.println(month);//month
     
       
     System.out.println(date.concat("-").concat(month).concat("-").concat(Year));
	}
}



//learn sub string again
/*in a sub string of two parameters in this example
if we want to find out the month then the first 3 index will be selected
and then to remove the last ones after Dec which ever index is there that
number has to be given to get only dec*/