package StarPattern;

/*
 
*   *
 * * 
  *  
 * * 
*   *

*/

public class Star_Pattern_15 {
	public static void main(String[] args) {
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				if(i==j || i+j==5-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
