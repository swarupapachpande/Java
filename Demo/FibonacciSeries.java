package Demo;

//0 1 1 2 3 5 8 11 

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1=0,n2=1;
		int sum;
		
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=2;i<10;i++) {
			sum = n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}		
	}
}
