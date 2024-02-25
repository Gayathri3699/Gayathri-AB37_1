package stringfunctions;

public class Split_Function 
{

	public static void main(String[] args)
	{
      /*here [0] = my
		[1] = name
		[2]= is
		[3]= gayathri*/
				
	    String s1 = "my name is gayathri";
		String name[] = s1.split(" ");//converting string to an array
		System.out.println(name[0]);
		System.out.println(name[3]);
		
		String s2 = "i love my country";
		String name1[]= s2.split(" ");
		System.out.println(name1[0]);
		System.out.println(name1[3]);
		}

}
