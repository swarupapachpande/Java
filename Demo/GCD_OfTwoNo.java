package Demo;

/*
  12 = 1,2,3,4,6,12
  8 = 1,2,4,8
  common factors = 1,2,4
  Greatest common factor = 4
 */


import java.util.Scanner;

public class GCD_OfTwoNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Two Numbers");		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int gcd = 1;
		
		for(int i=1; i<=n1 && i<=n2; ++i) {
			if(n1%i == 0 && n2%i == 0)
				gcd =i;
		}
		System.out.println("GCD of Two numbers : "+gcd);
	}

}
