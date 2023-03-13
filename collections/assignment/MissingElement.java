package collections.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
public static void main(String[] args) {
	int count=1;
	List<Integer> s1=new ArrayList<Integer>();
	
	s1.add(1);
	s1.add(2);
	s1.add(3);
	s1.add(4);
	s1.add(6);
	s1.add(7);
	s1.add(8);
	//System.out.println(s1);
	Collections.sort(s1);
   for (Integer i: s1) {
	   if(i!=count) {
		   System.out.println("The Missing element in the array is "+count);
		   count++;
	   }
	count++;
}
   }
	}

