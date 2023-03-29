package Week5.day2;

import org.testng.annotations.Test;

public class LearnPriority {
@Test(priority = -1)
public void create() {
	System.out.println("Created");
}
@Test(priority = -2)
public void delete() {
	System.out.println("Deleted");
}
@Test(priority = 1)
public void edit() {
	System.out.println("Edit");
}
}
