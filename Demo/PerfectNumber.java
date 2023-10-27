package Demo;

/*
Def : Perfect number, a	positive	integer	that	is	equal	to	the	sum	of	its	
proper	divisors.	The	smallest	perfect	number	is	6,	which	is	the	sum	
of	1,	2,	and	3.		
*/
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int sum=1;
		
		for(int i=2; i<=n/2; i++) {
			if(n%i==0)
				sum=sum+i;
		}
		
		if(sum==n) {
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not a perfect number");
		}
	}

}
