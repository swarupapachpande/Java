package String;

public class Reverse_Sentence {

	public static void main(String[] args) {
		String str = "Welcome Java Programming";
		
		String[] s = str.split("");
		String rev = " ";
		
		for(int i=s.length-1; i>=0; i--) {
			rev = rev + s[i]+"";
		}
		System.out.println(rev);
	}

}
