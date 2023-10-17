package String;

public class RemoveJunk {

	public static void main(String[] args) {
		String s = "@#$%^&^%$%^&***()?> Swarupa 0123456789";
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		
		String s1 = "@#$%#$% Testing (((((((( Java )*&^%$";
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}

}
