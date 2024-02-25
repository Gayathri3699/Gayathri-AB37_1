package stringfunctions;
public class Program4_Day31 
{
	public static void main(String[] args) 
	{
      /*String a = "rahul123";
      char b[] = a.toCharArray();
      for(int i=0;i<a.length();i++)*/
      {
 //to check if it is a numeric value
       //System.out.println(i  + " is a numeric value :"+Character.isDigit(b[i]));
    	  
 /*to check if it is a char
       boolean a = Character.isLetter(b[i]);
       System.out.println(i+ " is a char: " +a);*/
    	  
 /*to check if it is a digit  
       boolean tocheckdigit =  Character.isDigit(b[i]);
       System.out.println(i+ " is a digit:" +tocheckdigit);*/
    	  
 /*where ever there is a digit find the index of it
    	if(Character.isDigit(a.indexOf(i)));
    	{
    		System.out.println("the index of digit is:" +i);
    		check if this is correct
    	}*/
   	  
 //find out how many are char and how many are digit in a given string
    	  
    	 String name = "ram12";
    	 int digit = 0;
    	 int charcount = 0;
    	 for(int i= 0;i<name.length();i++)
    	 {
    		 if(Character.isDigit(name.charAt(i)))
    			 digit++;
    	 	 {
    			 System.out.println("Number of Digits" +digit);
    		 }
    		 if(Character.isLetter(name.charAt(i)))
    			 charcount++;
    				 {
    			 System.out.println("Number of characters" +charcount);
    				 }
    	 }
    	   
   
      }
      
    
      
	}

}
