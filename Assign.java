//create an array of length 4 of int data type and find the average of those numbers

package arrays;
public class Assign 
{

	public static void main(String[] args) 
	{
       int rollno[] = new int[4];
       rollno[0] = 20;
       rollno[1] = 30;
       rollno[2] = 40;
       rollno[3] = 50;
       int sum = 0;
       
       for(int i =0;i<4;i++)
       {
    	   sum = sum+rollno[i];
    	   /* 0+20   = 20
    	      20+30  = 50
    	      50+40  = 90
    	      90+50  = 140
    	    */
    	 //  System.out.println(sum);
    	   double average = sum/rollno.length;
    	   System.out.println(average);
    	   
       }
	}

}
