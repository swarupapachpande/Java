package String;

public class Remove_White_Spaces {

	public static void main(String[] args) {
		
		String str = "Java       Programming   Testing Cpp";
		System.out.println("Before removing white spaces : "+str);
		
		str = str.replaceAll("\\s", "");
		System.out.println("After removing the white spaces : "+str);
	}

}
