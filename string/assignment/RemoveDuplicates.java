package string.assignment;

public class RemoveDuplicates {
public static void main(String[] args) {
	String text="We learn java basics as part of java sessions in java week1";
	int count;
	String[] split = text.split(" ");
	System.out.println("The Duplicated word is: ");
	for(int i=0;i<split.length;i++) {
		count=1;
		for(int j=i+1;j<split.length;j++) {
			if(split[i].equals(split[j])) {
				count++;
				split[j]="0";
			}
		}
		if(count>1&&split[i]!="0") {
			System.out.println(split[i]);
		}
	}
}
}
