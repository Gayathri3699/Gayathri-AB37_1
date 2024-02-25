package stringfunctions;
import java.util.Date;
public class FutureTime_Day30 
{
	public static void main(String[] args) 
	{
	/*if we have the current time and if we want to add the future time
	  we need to add 24hrs then it'll become future time*/
		
    /*1000 - milisec
      60 - seconds
      60 - minutes
      24 - hours a day
      *1  - a day, if we want second day replace one with 2
     */
	 
       Date d1 = new Date();
      System.out.println( d1.getTime());//convert with epoch converter
      
      Date d2 = new Date(d1.getTime()+(1000*60*60*24*9));
      System.out.println(d2);
      //if we do addition we will get future time
      //if we do subtraction we will get past time
      
      
	}

}
