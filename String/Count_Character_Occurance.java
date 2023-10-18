package String;

// Java Programming Java Concept = a's = 5

public class Count_Character_Occurance {

	public static void main(String[] args) {
		
		String s = "Java Programming Java Concept";
		
		int totalCount = s.length();    //total length  
		
		int totalCount_afterReplace = s.replace("a", "").length();   //total length after removing a's
		
		int count = totalCount - totalCount_afterReplace;
		
		System.out.println("Number Occurance a is : "+count);
	}

}
