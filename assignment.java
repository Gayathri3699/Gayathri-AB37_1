package assignments;

//ASSIGNMENT 79 related 
public class assignment {
    public static void main(String[] args) {
        String name = "rahul123";

        // Separate numeric values and characters
        String numericValues = "";
        String characters = "";

        for (int i = 0; i < name.length(); i++)
        {
            char currentChar = name.charAt(i);

            if (Character.isDigit(currentChar)) 
            {
                // Numeric value
                numericValues += currentChar;
            }
            else 
            {
                // Character
                characters += currentChar;
            }
        }

        // Print the results
        System.out.println("Numeric Values: " + numericValues);
        System.out.println("Characters: " + characters);
    }
}