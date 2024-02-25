package assignments;
import java.util.Arrays;
public class Assignment_84 {
	public static void main(String[] args) 
	{
      String s1 = "care";
      String s2 = "race";
      if(s1.length() != s2.length())
      {
    	  System.out.println("its not an anagram");
      }
      else
      {
    	  char[] a1 = s1.toCharArray();
    	  Arrays.sort(a1);
    	 System.out.println( Arrays.toString(a1));
    	 
    	 char[] a2 = s2.toCharArray();
    	 Arrays.sort(a2);
    	 System.out.println(Arrays.toString(a2));	 
//Arrays.equals(a1,a2) is used to compare both arrays,return type is boolean    	 
    	 if(Arrays.equals(a1, a2))
         {
       	  System.out.println("its an anagram");
         }
    	 else
    	 {
    		System.out.println("its not an anagram");
    	 }
      }
      
	}

}
