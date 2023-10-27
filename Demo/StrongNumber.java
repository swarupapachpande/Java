package Demo;

import java.util.Scanner;

/*
Def: Strong numbers	are	the	numbers	whose	sum	of	factorial	of	digits	is	equal	to	the	
original	number.		
Example:	145	is	a	strong number
*/

public class StrongNumber {
	static int fact(int n) {
		int fact = 1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		
		int num = n;
		int sum = 0;
		int t = num;
		
		while(num!=0) {
			int r=num%10;
			sum=sum+fact(r);
			num=num/10;
		}
		
		if(sum==t)
			System.out.println("Strong number");
		else
			System.out.println("Not a strong number");
	}

}
