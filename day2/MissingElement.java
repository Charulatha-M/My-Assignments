package week1.day2;

import java.util.Arrays;

public class MissingElement {
public static void main(String[] args) {
	int[] arr={1,2,3,4,7,6,8};
	int length=arr.length;
	int c=0;
	Arrays.sort(arr);
	for (int i=1;i<=arr[length-1];i++) {
		if	(arr[c]==i) {
			c++;
		}
		else {
			System.out.println("Missing Element is "+i);
			break;
		}
	}
}
}
