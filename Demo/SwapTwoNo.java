package Demo;

public class SwapTwoNo {

	public static void main(String[] args) {
		
		int a=100, b=200;
		System.out.println("before swap no. : "+a+" "+b);
		
		//using 3rd variable
		/*int t=a;
		a=b;
		b=t;
		System.out.println("after swap no. : "+a+" "+b);*/
		
		//using + & - without 3rd variable
		/*a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap no. : "+a+" "+b);*/
		
		//using * & / without 3rd variable
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("after swap no. : "+a+" "+b);

	}

}
