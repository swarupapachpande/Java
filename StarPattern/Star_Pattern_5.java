package StarPattern;

/*
 
 ****
  ***
   **
    *
 
 */

public class Star_Pattern_5 {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {	//row
			for(int j=1; j<=i; j++) {	//space Colum
					System.out.print(" ");
				}
				for(int k=4; k>=i; k-- ) {	//star colum
					System.out.print("*");
				}
			System.out.println();
		}
	}

}
