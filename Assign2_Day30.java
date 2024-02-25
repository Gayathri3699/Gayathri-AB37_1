package stringfunctions;
//ASSIGNMENT74
public class Assign2_Day30 
{

	public static void main(String[] args) 
	{
     /*write a string of name with combination of upper case and lower case
       and get the output as output1 all capital letters 
       output 2 all small letters
      */
		String name = "GroTechMinds";
		System.out.println(name.replaceAll("[a-z]", ""));
		System.out.println(name.replaceAll("[A-Z]", ""));
		

	}

}
