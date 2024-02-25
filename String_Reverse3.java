package stringfunctionspractice;
//original way to reverse a string
public class String_Reverse3 
{

	public static void main(String[] args) 
	{
       String input = "chary";
       String output = "";
       for(int i = input.length()-1;i>=0;i--)
       {
    	   char reverse = input.charAt(i);//charat(i) return type is string
    	   output = output+reverse;	   
       }
       System.out.println(output);
	}
//in this the input and output both are string
}
