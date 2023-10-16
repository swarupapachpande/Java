package StarPattern;
   
/*
 
   *
  ***
 *****
*******    		
 *****  
  ***			 
   *
*/

public class Star_Pattern_17 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {	//space
				System.out.print(" ");
			}
			for(int k=1;k<(i*2)-1;k++) {	//star
				System.out.print("*");
			}			
			System.out.println();
		}
		for(int i=4-1; i>=1; i--) {
			for(int j=4-1; j>=i; j--) {
				System.out.println(" ");
			}
			for(int k=1; k<(i*2)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
