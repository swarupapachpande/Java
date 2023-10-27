package Array;

// [10, 26, 50, 70, 84, 302]

import java.util.Arrays;

public class Sorting_Element {

	public static void main(String[] args) {

		int a[] = {10,50,302,70,26,84};		
		System.out.println("Arrays before sorting : "+Arrays.toString(a));
		
		//method 1
		Arrays.parallelSort(a);
		System.out.println("Arrays after sorting : "+Arrays.toString(a));
		
		//method 2
		Arrays.sort(a);
		System.out.println("Arrays after sorting : "+Arrays.toString(a));
	}

}
