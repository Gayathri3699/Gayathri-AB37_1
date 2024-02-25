//create an array of length 4 and copy its value into another array using iteration
//ASSIGNMENT 65


package arrays;

public class Program5 
{

	public static void main(String[] args) 
	{
      int rollno[] = new int [4];
      rollno[0] = 98;
      rollno[1] = 65;
      rollno[2] = 43;
      rollno[3] = 32;
      
      int[] rn1 = new int[4];
      for(int i=0;i<4;i++)
      {
    	  rn1[i] = rollno[i];
    	  System.out.println(rn1[i]);
      }
      

	}

}


//check program from class once again and try 