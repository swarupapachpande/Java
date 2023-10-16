package Array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[] = new int[30];
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value : ");
		size =sc.nextInt();
		
		System.out.println("Enter value : ");		
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Values are : ");
		for(int i=0; i<size;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
