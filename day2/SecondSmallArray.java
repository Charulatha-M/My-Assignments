package week1.day2;

import java.util.Arrays;

public class SecondSmallArray {

	public static void main(String[] args) {
		int[] arr={23,45,67,32,89,22};
         int length=arr.length;
         Arrays.sort(arr);
         for (int i=0;i<arr.length;i++)
 		{
 			System.out.println(arr[i]);
 		}
 System.out.println("Second smallest number in the Array is "+arr[length-5]);
	}

}
