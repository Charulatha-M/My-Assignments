package collections.assignment;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicate {
public static void main(String[] args) {
	List <Integer> name=new ArrayList<Integer>();
	name.add(14);
	name.add(12);
	name.add(13);
	name.add(11);
	name.add(15);
	name.add(14);
	name.add(18);
	name.add(16);
	name.add(17);
	name.add(19);
	name.add(18);
	name.add(17);
	name.add(20);
	for(int i=0;i<name.size();i++) {
		  for (int j = i+1; j <name.size() ; j++) {
              if(name.get(i).equals(name.get(j))){
                  System.out.println(name.get(i));
              }
		  }
	}
		}
		  }

