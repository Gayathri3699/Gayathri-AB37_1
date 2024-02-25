package assignments;
public class Assignment_66 
{
	public static void main(String[] args)
	{
      int rollno[] = new int[4];
      rollno[0] = 6;
      rollno[1] = 2;
      rollno[2] = 5;
      rollno[3] = 1;
      int sum = 0;
      for(int i =0;i<4;i++)
      {
    	  sum = sum+rollno[i];  	  
      }  
    //find out the average of these numbers
	  double average = sum/rollno.length;
	  System.out.println(average);
	  //find out the remainder of these numbers
	  double remainder = sum%rollno.length;
	  System.out.println(remainder);
	}
}
