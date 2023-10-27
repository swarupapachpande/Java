package Demo;

import java.util.Scanner;

public class Reverse_Print_Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		
		for(int i=n; i>=1; i--) {
			System.out.print(i+" ");
		}
	}

}
