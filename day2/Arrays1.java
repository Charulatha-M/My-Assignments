package week1.day2;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		int[] value= {97,95,67,91,56};//Declared by data
		int[] nums=new int[10];//declared by size
		nums[0]=56;
		nums[1]=65;
		nums[2]=67;
		//length of arrays
		int length = value.length;
		//ctrl+2l to assign the local variable
		//System.out.println(length);
		//System.out.println(value[1]);
		Arrays.sort(value);
		for (int i=0;i<value.length;i++)
		{
			System.out.println(value[i]);
		}
		//last index
		System.out.println(value[length-1]);
		//Second largest number
		System.out.println(value[length-2]);
	//reverse order
	for (int i=value.length-1;i>=0;i--) {
		System.out.println(value[i]);
	}
	}
}
