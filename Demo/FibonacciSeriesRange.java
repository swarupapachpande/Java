package Demo;

import java.util.Scanner;

public class FibonacciSeriesRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range...");
		int range = sc.nextInt();
		
		int a=0;
		int b=1;
		int c=0;
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		for(int i=2; i<=range; i++) {
			c=a+b;
			if(c<=range) {
				System.out.print(c+" ");
				a=b;
				b=c;
			}
		}
	}

}
