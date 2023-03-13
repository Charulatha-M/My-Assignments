package string.assignment;

public class Plaindrome {
	public static void main(String[] args) {
		String s1="Madam",s2="";
		char[] charArray = s1.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
	if(s1.equalsIgnoreCase(s2)) {
		System.out.println("It is a Palindrome");
	}
	else {
		System.out.println("Not a Palindrome");
	}
	}
}
