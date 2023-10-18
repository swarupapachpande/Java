package String;

public class Count_The_Words {

	public static void main(String[] args) {
		
		String s = "Java Program Oops Concept";
		int count = 1;
		
		for(int i=0; i<s.length()-1; i++) {
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("Total count words : "+count);
	}

}
