package String;

public class Reverse_Words {

	public static void main(String[] args) {
		
		String str = "Welcome to java";
		
		char[] ch = str.toCharArray();
		String rev="";
		
		for(int i=ch.length-1; i>=0; i--) {
			rev = rev+ch[i];
		}
		System.out.println(rev);
	}

}
