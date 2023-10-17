package Array;

public class Max_Min_Values_Array {

	public static void main(String[] args) {
		
		int a[]= {50,20,40,60,10,70,45};
		
		int max=a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum Value in Array : "+max);
		System.out.println();
		
		int min = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Minimum Value in Array : "+min);
	}

}
