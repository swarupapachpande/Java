package Demo;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		System.out.println("Prime numbers between 1 and "+n);
		
		for(int i=1; i<n; i++) {
			boolean isPrime = true;
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
				System.out.print(i+" ");
		}
	}

}
