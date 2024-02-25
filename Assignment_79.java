package assignments;
public class Assignment_79 
{
	public static void main(String[] args) 
	{
       String name = "ram123";
       char c[] = name.toCharArray();
       
       for(int i=0;i<name.length();i++)
       {
    	   boolean ans = Character.isDigit(c[i]);
    	if(ans == true)
    	{
    		System.out.println(c[i]  + "is a digit");
    	}
    	else
    	{
    		System.out.println(c[i]  + "is a character");
    	}
       }    
	}
}
