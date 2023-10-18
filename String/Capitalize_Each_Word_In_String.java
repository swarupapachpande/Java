package String;

// My Name Is Swarupa. 

public class Capitalize_Each_Word_In_String {

	public static void main(String[] args) {
		
		String str = "my name is swarupa.";
		System.out.println("Before Capitalize : "+str);
		System.out.println();
		
		String[] word = str.split("\\s");
		String  capitalizeWord = "";
		
		for(String w:word) {
			String first = w.substring(0,1);
			String afterfirst = w.substring(1);
			capitalizeWord = capitalizeWord + first.toUpperCase()+afterfirst+" ";
		}
		System.out.println("After Capitalize : "+capitalizeWord);
	}

}
