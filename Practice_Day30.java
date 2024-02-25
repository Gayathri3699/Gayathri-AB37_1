package stringfunctionspractice;

import java.util.Arrays;

public class Practice_Day30 
{

	public static void main(String[] args) 
	{
       String name = "abhishek";
      // System.out.println(name.replaceAll("a", ""));
      // System.out.println(name.replaceAll("a", "A"));
       
       String quote ="i love my country";
       //System.out.println(quote.replaceAll(" ", ""));
       
 //remove all the alphabets from this      
       String alphanum = "kiran123";
      // System.out.println(alphanum.replaceAll("[a-z]", ""));
       
 //get the o/p as M N I M
       String a1 = "My Name Is Manish";
      // System.out.println(a1.replaceAll("[a-z]", ""));
       
//COMB OF UPPERANDLOWER CASE op-1 cap letters op-2 smaller letters
       String combi = "ArChAnA";
      // System.out.println(combi.replaceAll("[a-z]", ""));
       //System.out.println(combi.replaceAll("[A-Z]", ""));
       
//split function - return type is array of string
       
       String s1 = "my name is manish";
       String s2[]  = s1.split(" ");
      //System.out.println(Arrays.toString(s2));

//in an array find out if 41 is present or not
      
      int num[] = {15,41,25,43}; 
      int find = 41;
      for(int i=0;i<num.length;i++)
      {
    	if(find == num[i])
    	{
    		System.out.println("Number is Present at index:" +i);
    	}
    	
	}

}}
