package collections.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
public static void main(String[] args) {
	List <Integer> set1 =new ArrayList<Integer>();
	set1.add(3);
	set1.add(2);
	set1.add(11);
	set1.add(4);
	set1.add(6);
	set1.add(7);
	Collections.sort(set1);
	System.out.println(set1);
	Integer temp = set1.get(set1.size()-2);
	System.out.println("The Second largest element is: "+temp);
}
}
