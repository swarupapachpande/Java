package String;

public class Conversion_Of_String_To_Integer {

	public static void main(String[] args) {
		
		//1st way
		String str = "5";
		int result = Integer.parseInt(str);	  //Using Integer.parseInt();
		System.out.println(result);
		
		
		//2nd way
		String s = "10";
		int result2 = Integer.valueOf(s);	  //Using Integer.valueOf()
		System.out.println(result2);
	}

}
