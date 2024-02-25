package stringfunctions;
public class Program2_Day30 
{
	public static void main(String[] args)
	{
       /*create an array of size 4 and store all the int numbers and find
         out if 41 is present or not
         if it is present give a message
         if it is not present give a message
        */
		
		int number[] = {78,89,100,4};
		int numbertocheck = 78;
		for(int i =0;i<=3;i++)
		{
			if(numbertocheck == number[i])
			{
				System.out.println("Number is present in the index:"  +i);
			}
			else
			{
				System.out.println("Number not found in the index:" +i);
			}
		}
		
	}

}
