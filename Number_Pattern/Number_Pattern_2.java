package Number_Pattern;

/*
1				1
12				22
123				333
1234			4444
*/

public class Number_Pattern_2 {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1;j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
