package Demo;

import java.util.Scanner;

//Display sum 1 to n no.

public class Sum_Num {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			sum = sum+i;
		}
		System.out.print("Sum is : "+sum);
	}

}
