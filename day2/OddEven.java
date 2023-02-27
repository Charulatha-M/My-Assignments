package week1.day2;

public class OddEven {
public static void main(String[] args) {
	int num=5,i;
	if (num%2==0) {
		System.out.println("Even Number");
	}
	else {
		System.out.println("Odd number");
	}
	for(i=1;i<=20;i++)
	{
		if(i%2!=0) {
			System.out.println(i);
		}
		//else {
			//System.out.println("Even Number " +i);
		//}
	}
}
}
