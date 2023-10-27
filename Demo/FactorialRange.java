package Demo;

import java.util.Scanner;

public class FactorialRange {

	static int fact(int num) {
		int fact = 1;
		while(num>0) {
			fact = fact*num;
			num--;
		}
		return fact;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the factorial range number : ");
		int n = sc .nextInt();
			
		for(int i=1; i<=n; i++) {			
			System.out.println(i+"! = "+fact(i));
		}
		
	}

}
