package collections.assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
public static void main(String[] args) {
	List<Integer> set1=new ArrayList<Integer>();
	List<Integer> set2=new ArrayList<Integer>();
	set1.add(3);
	set1.add(2);
	set1.add(11);
	set1.add(4);
	set1.add(6);
	set1.add(7);
	set2.add(1);
	set2.add(2);
	set2.add(8);
	set2.add(4);
	set2.add(9);
	set2.add(7);
	set1.retainAll(set2);
    System.out.println("The intersected elements are:"+set1);
	
}
}
