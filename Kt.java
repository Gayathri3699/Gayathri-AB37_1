package stringfunctions;

public class Kt 
{

	public static void main(String[] args) 
	{
       String name = "kiran123";
       char[] ch = name.toCharArray();
      //System.out.println(ch[3]);
       for(int i=0;i<ch.length;i++)
       {
   boolean ans  =   Character.isDigit(ch[i]);
       
   if(ans == true)
   {
	   System.out.println(ch[i]+" : is a Number and it's index " +i  );
   }
   else
   {
	   System.out.println(ch[i]+" :  is a Character and it's index " +i);

   }
       }    
	}

}
