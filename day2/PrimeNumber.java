package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=16;
		boolean flag=false;
		for (int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=true;
			}
		}
			if (flag==true) {
				System.out.println("Not a Prime Number");
			}
			else {
				System.out.println("Prime Number");
			}
		}
	}
