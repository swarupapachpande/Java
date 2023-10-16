package Demo;

//12345 = 5
import java.util.Scanner;

public class Count_No_Of_Digits_In_No {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Digit : ");
		int num = sc.nextInt();
		int count = 0;
		
		while(num>0)
		{
			num = num/10;
			count++;
		}
		System.out.println("Count number of digit : "+count);
	}

}
