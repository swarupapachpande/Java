package Array;

import java.util.Arrays;
import java.util.Scanner;

public class CheckArraysEquals {

	public static void main(String[] args) {
		int a1[] = {1,2,3,4,5};
		int a2[] = {1,2,3,4,5};
		
		boolean status = Arrays.equals(a1,a2);
		if(status == true) {
			System.out.println("Arrays are Equal");
		}
		else {
			System.out.println("Arrays are Not Equal");
		}
		
	}

}
