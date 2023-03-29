package Week5.day2;


import org.testng.annotations.Test;

public class DependsON {
	@Test
	public void create() {
		System.out.println("Created");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods = {"create","edit"},alwaysRun = true)
	public void delete() {
		System.out.println("Deleted");
	}
	@Test(timeOut = 1000)
	public void edit() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Edit");
	}
}
