package stringfunctionspractice;

import java.util.Arrays;

public class Practice_Day31 
{
	public static void main(String[] args)
	{
 //check if two arrays are equals to each other
		int num[]  = {20,50,25};
		int num1[]= {20,50,25};
        //System.out.println( Arrays.equals(num, num1));
        
 //take string alphanumeric value and check which is numeric value and char       
        String name = "ram123";
      char a[] =   name.toCharArray();
      for(int i=0;i<name.length();i++)
      {
      boolean answer = Character.isDigit(a[i]);
      if(answer ==true)
      {
    	  //System.out.println("It is a numeric value:" +a[i]);
      }
      else
      {
    	  //System.out.println("It is not a numeric value:" +a[i]);
      }
      }
 //in rahul123 find out how many are char how many are digit
      String s1 = "rahul123";
      char a1[] = s1.toCharArray();
      int count =0;
      int temp = 0;
      
      for(int i=0;i<s1.length();i++)
      {
    	  boolean answer = Character.isDigit(a1[i]);
   
    	  if(answer ==true)
    	  {
      		  count++;
    	  }
    	  else
    	  {
              temp++;
          }
      }
      System.out.println("Number of Digits:" +count++);
      System.out.println("Number of Characters:" +temp++);
      
      
      
		
				}

}
