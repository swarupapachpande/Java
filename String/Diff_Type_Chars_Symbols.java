package String;

public class Diff_Type_Chars_Symbols {

	public static void main(String[] args) {
		
		String str = "Swarupa  Pachpande@123%ABC";
		int upper = 0, lower = 0, special = 0, space=0, digit= 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') 
				upper++;
			else if(ch >='a' && ch <= 'z')
				lower++;
			else if(ch >='0' && ch<='9')
				digit++;
			else if(ch ==' ')
				space++;
			else
				special++;
		}
		System.out.println("Upper case : "+upper);
		System.out.println("Lower csae : "+lower);
		System.out.println("Decimal number : "+digit);
		System.out.println("Space : "+space);
		System.out.println("Special Characters : "+special);
	}

}
