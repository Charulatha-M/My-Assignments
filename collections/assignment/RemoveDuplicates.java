package collections.assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
public static void main(String[] args) {
	String text="We learn java basics as part of java sessions in java week1";
	String result="";
	String[] split = text.split(" ");
	LinkedHashSet<String> set= new LinkedHashSet<String>(Arrays.asList(split));
	for (String word : set) {
		result=result + word + " ";
		
	}
	System.out.println(result);

 }
}
