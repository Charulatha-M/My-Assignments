package week1.day2;

public class ConditionalStatement {

	public static void main(String[] args) {
	int age=17, mark=12;
	if (age>=18) {
		System.out.println("Eligible to Vote");
	}
	else {
		System.out.println("Not Eligible");
	}
	if ((mark>=35)&&(mark<=60)) {
		System.out.println("Pass");
	}
	else if ((mark<=34)||(mark<=1)){
		System.out.println("Fail");
	}
	else if(mark==90) {
		System.out.println("A Grade");
	}
	else {
		System.out.println("Error");
	}
}
}
