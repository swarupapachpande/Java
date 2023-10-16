package Demo;

public class LargestOfThreeNo {

	public static void main(String[] args) {
		int a=100,b=200,c=300;
		if(a>b && a>c) {
			System.out.println("a is largest "+a);
		}else if(b>c && b<c){
			System.out.println("b is largest "+b);
		}else {
			System.out.println("c is largest "+c);
		}
	}

}
