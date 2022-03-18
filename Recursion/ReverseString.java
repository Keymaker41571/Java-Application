public class ReverseString {
	
	public static void main(String[] args) {
		
		String k = "!@#testingRevSTRING";
		
		ReverseString s = new ReverseString();
		System.out.println(s.reverseString(k));
	}
	
	public String reverseString(String k) {
		if(k.isEmpty()) {
			return k;
		}
		else {
			return reverseString(k.substring(1)) + k.charAt(0);
		}
	}
}
