package Demo;

//madam

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String a = sc.next();
		String org = a;
		String rev = "";
		
		int len = a.length();
		
		for(int i=len-1; i>=0; i--) {
			rev = rev+a.charAt(i);
		}
		if(org.equals(rev)) {
			System.out.println("Palindrome String : "+rev);
		}else{
			System.out.println("Not Plaindrome String : "+rev);
		}
	}

}
