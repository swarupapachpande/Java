package StarPattern;

/*
 	 *               *
    * *             **
   * * *      =>   ***
  * * * *         ****
 
*/

public class Star_Pattern_7 {

	public static void main(String[] args) {
		
		//Fisrt Pattern
		for(int i=1; i<=4; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		//Second Pattern
		/*
		for(int i=1; i<=4; i++) {
			for(int j=4; j>=1; j--) {
				if(j>i) {
					System.out.print(" ");
				}
				else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
		*/
	}

}
