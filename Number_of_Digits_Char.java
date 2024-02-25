package stringfunctions23_2_24;

public class Number_of_Digits_Char
{

	public static void main(String[] args)
	{
      String name = "rahul123";
       char[] ch = name.toCharArray();//to find out number of digits and characters we are using character class and it has a method known as isDigit using it we can solve this
       int count = 0;//initialsing a digit as 0
       int temp = 0;//initialsing a character as 0
       
              for(int i=0;i<name.length();i++)
             {      
              boolean ans = Character.isDigit(ch[i]);//return type is boolean
              if(ans==true)
              {
            	  count++; //it counts with the iteration and checks how many numbers are their
              }
              else
              {
            	  temp++;
              }
              
             }
       System.out.println("Number of Digits " +count);
              
       System.out.println("Number of Characters " +temp);      
	}

}
