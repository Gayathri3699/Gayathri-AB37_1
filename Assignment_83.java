package assignments;

public class Assignment_83 {

	public static void main(String[] args) 
	{
       String input = "madam";
       String output = "";
       for(int i =input.length()-1;i>=0;i--)
       {
    	   char reverse = input.charAt(i);
    	   output = output +reverse;
    	   
       }
       System.out.println(output);
       if(input.equals(output))
    		   {
    	        System.out.println("Its an palindrome");
    		   }
       else
       {
    	   System.out.println("its not an palindrome");
       }
	}

}
