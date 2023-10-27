package Demo;

import java.util.Scanner;

public class RangeOfPerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int sum=1;
			for(int j=2; j<=i/2; j++) {
				if(i%j == 0) {
					sum=sum+j;
				}
			}
			if(sum == i) {
				System.out.println(i+" Perfect Number");
			}
		}
	}

}
