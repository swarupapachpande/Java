package Demo;

import java.util.Scanner;

public class Print_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(i);
		}
	}

}
