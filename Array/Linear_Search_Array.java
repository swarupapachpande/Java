package Array;

public class Linear_Search_Array {

	public static void main(String[] args) {
		
		int a[] = {10,20,40,60,50};
		
		int search = 60;
	//	int search = 100
		boolean flag = false;
		
		for(int i=0; i<a.length; i++) {
			if(search == a[i]) {
				System.out.println("Element found at : "+i);
				flag = true;
				break;
			}
		}
		
		if(flag==false) {
			System.out.println("Element is not found");
		}
	}

}
