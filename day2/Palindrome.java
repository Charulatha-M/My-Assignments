package week1.day2;

public class Palindrome {
public static void main(String[] args) {
	int sum=0,temp;
	int n=34343;
	temp=n;
	while(n!=0) {
		sum=(sum*10)+n%10;
		n=n/10;
	}
	if(temp==sum) {
		System.out.println("Palindrome Number");
	}
	else {
		System.out.println("Not a Palindrome Number");
	}
}
}
