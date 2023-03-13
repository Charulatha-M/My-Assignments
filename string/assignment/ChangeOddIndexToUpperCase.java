package string.assignment;

public class ChangeOddIndexToUpperCase {
 public static void main(String[] args) {
	String test="changeme";
	String result="";
	for(int i=0;i<test.length();i++) {
		char ch=test.charAt(i);
		if(i%2!=0) {
			result+=ch;
		}
		else {
			result+=Character.toUpperCase(ch);
		}
	}
	 System.out.println(result);
}

}