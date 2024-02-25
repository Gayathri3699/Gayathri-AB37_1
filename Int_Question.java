package stringfunctions23_2_24;

public class Int_Question {

	public static void main(String[] args)
	{
		 String name = "world no 1 @$#";
	        int specialCharCount = countSpecialCharacters(name);
	        System.out.println("Number of special characters in the string: " + specialCharCount);
	    }

	    public static int countSpecialCharacters(String str) {
	        int count = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
	                count++;
	            }
	        }
	        return count;
       
       
  }
       
 }


