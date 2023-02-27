package week1.day2;

public class FibonaciSeries {
public static void main(String[] args) {
	int range=8,firstNum=0,secNum=1;
	System.out.println("First Number is "+firstNum);
	for (int i=0;i<range;i++) {
		int sum=firstNum+secNum;
		firstNum=secNum;
		secNum=sum;
		System.out.println(sum);
		
	}
}
}
