package stringfunctions;
public class Name_Replace 
{
	public static void main(String[] args)
	{
		//write a string name abhishek and remove a from abhishek
         String name = "abhishek";
         System.out.println(name.replaceAll("a", ""));
         //replace small a with capital A
         System.out.println(name.replaceAll("a", "A"));
         
         //remove space between the quote
         String quote = "I Love My Country";
         System.out.println(quote.replaceAll(" " , ""));
         
         //pick alphanumeric value and remove all the alphabets from it
         String a1 = "country123";
         System.out.println(a1.replaceAll("[a-z]", ""));

	}

}
