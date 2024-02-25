package package1;

public class Andnot {

	public static void main(String[] args) {
     int a=10;
     int b=20;
     if(!(a>6 && b>6))//should not give semi colon after if condition 
     {
    	 System.out.println("1");
     }
	}

}
