package String;

public class PallindromeString {

	public static void main(String[] args) {
		String str = "madam";
		String org = str;
		String rev = "";
		int len = str.length();
		
		for(int i=len-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		if(org.equals(rev)) {
			System.out.println("Palindrome :"+rev);
		}else{
			System.out.println("Not Palindrome :"+rev);
		}
	}

}
