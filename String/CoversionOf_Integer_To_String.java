package String;

public class CoversionOf_Integer_To_String {

	public static void main(String[] args) {
		
		int a = 5;
		String str = Integer.toString(a);		//Using Integer.toString()
		System.out.println(str);
		
		String str2 = String.valueOf(a);		//using String.valueOf()
		System.out.println(str2);
	}

}
