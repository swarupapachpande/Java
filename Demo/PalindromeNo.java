package Demo;

//12321

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No : ");
		int num = sc.nextInt();
		int org = num;
		int rev = 0;
		
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
			if(org==rev)
			{
				System.out.println("Palindrome : "+org);
			}
			else
			{
				System.out.println("Not Palindrome : "+org);
			}
	}

}
