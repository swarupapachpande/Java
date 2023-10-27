package Demo;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String a = sc.next();	//Swarupa
		String rev = "";
		
		int len = a.length();
		
		for(int i=len-1; i>=0; i--) {
			rev = rev + a.charAt(i);
		}
		System.out.println("Reverse String : "+rev);
	}

}
