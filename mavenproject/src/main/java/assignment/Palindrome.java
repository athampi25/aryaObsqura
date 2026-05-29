package assignment;

public class Palindrome {
	public static void checkPalindrome(String s) {
		String rev ="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		
		if(rev.equalsIgnoreCase(s)) {
			System.out.println("String "+s+" is a palindrome");
		}
		
		else {
			System.out.println("String "+s+" is not a palindrome");
		}
		
		
	}

	public static void main(String[] args) {
		
		Palindrome.checkPalindrome("Java");
		Palindrome.checkPalindrome("Malayalam");

	}

}
