package Array;

public class EvenOddArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		
		//Extracting even & Odd numbers
		
		System.out.println("Even Numbers in Array: ");
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		
		System.out.println("Odd Numbers in Array: ");
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==1) {
				System.out.print(a[i]+" ");
			}
		}

		/*
		//Enhanced for loop
		System.out.print("Even No : ");
		for(int value:a) {
			if(value%2==0)
				System.out.print(value+" ");
		}
		System.out.println();
		
		System.out.print("Odd no : ");
		for(int value:a) {
			if(value%2==1)
				System.out.print(value+" ");
		}
		*/
	}

}
