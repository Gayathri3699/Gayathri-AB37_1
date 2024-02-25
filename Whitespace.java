package stringfunctions23_2_24;

public class Whitespace 
{

	public static void main(String[] args) 
	{
      String name = "world no 1 @$*";
       char[] ch =  name.toCharArray();
       
       int spclch = 0;
       
       for(int i=0;i<name.length();i++)
       {
    	  if( Character.isDigit(ch[i]) 
    			  &&
    		  Character.isWhitespace(ch[i]));
    	  
    	  spclch++;
       }
       if(spclch == 0)
       {
    	   System.out.println("No Special Characters found.");
       }
       else
       {
    	   System.out.println("String has special characters " +spclch);
       }
	}

}

//check once again
