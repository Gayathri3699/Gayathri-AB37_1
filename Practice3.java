package arrays;
//create array of length 4 and find the avg and remainder of it
public class Practice3
{

	public static void main(String[] args) 
	{
      int num[] = new int[4];
      num[0] = 20;
      num[1] = 50;
      num[2] = 5;
      num[3] = 10;
      
      int sum = 0;
      
      for(int i=0;i<4;i++)
      {
    	  sum = sum+num[i];  
    	  //0+20=20;
    	  //20+50=70;
    	  //70+5 =75;
    	  //75+10=85;
    	 // System.out.println(sum);    	  
      }
      double average = sum/4;
	  System.out.println(average);
	  double remainder = sum%num.length;//% operator is used to find the reaminder
	  System.out.println(remainder);
	}

}
