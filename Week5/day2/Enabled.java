package Week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Enabled {
	@Test(enabled = false)
	public void create() {
		System.out.println("Created");
	}
	@Ignore
	@Test
	public void delete() {
		System.out.println("Deleted");
	}
	@Test
	public void edit() {
		System.out.println("Edit");
	}
}
