package Array;

public class Binary_Search {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int key = 5;
		boolean flag = false;
		
		int l = 0;		//lower
		int h = a.length-1;	 //higher
		
		while(l <= h) {
			
			int mid = (l+h)/2;
			
			if(a[mid]==key) {
				System.out.println("Element found..");
				flag = true;
				break;
			}
			
			if(a[mid]<key) {
				l=mid+1;
			}
			if(a[mid]>key){
				h=mid-1;
			}
			
			if(flag == false) {
				System.out.println("Element Not found..");
			}
		}
	}

}
