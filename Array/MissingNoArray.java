package Array;

public class MissingNoArray {

	public static void main(String[] args) {
		
		//Array should not have duplicates
		//Array No need to be sorted order
		//Values should be in range
		
		int a[]= {1,2,4,5};
		
		//1+2+4+5 = 12  sum1
		//1+2+3+4+5 =15  sum2
		//sum2-sum1= 15-12=3  missing 
		
		int sum1=a[0];
		for(int i=1; i<a.length; i++) {
			sum1=sum1+a[i];
		}
		System.out.println("Sum of elements in array : "+sum1);
		
		int sum2=0;
		for(int i=1; i<=5; i++) {
			sum2=sum2+i;
		}
		System.out.println("Sum of range of elements: "+sum2);
		
		int miss_no = sum2-sum1;
		System.out.println("Missing Element: "+miss_no);
	}

}
