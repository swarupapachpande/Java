package Demo;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Even No:"+num);
		}else {
			System.out.println("Odd No:"+num);
		}
	}

}
