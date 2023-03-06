package selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		ChromeDriver leaftaps=new ChromeDriver();
		leaftaps.get("http://leaftaps.com/opentaps/control/login");
		leaftaps.manage().window().maximize();
		leaftaps.findElement(By.id("username")).sendKeys("demosalesmanager");
		leaftaps.findElement(By.id("password")).sendKeys("crmsfa");
        leaftaps.findElement(By.className("decorativeSubmit")).click();
        leaftaps.findElement(By.partialLinkText("CRM/SFA")).click();
        leaftaps.findElement(By.linkText("Leads")).click();
        leaftaps.findElement(By.linkText("Create Lead")).click();
        leaftaps.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        leaftaps.findElement(By.id("createLeadForm_firstName")).sendKeys("Charulatha");
        leaftaps.findElement(By.id("createLeadForm_lastName")).sendKeys("Mohan");
        leaftaps.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Charu");
        leaftaps.findElement(By.id("createLeadForm_departmentName")).sendKeys("Education");
        leaftaps.findElement(By.id("createLeadForm_description")).sendKeys("*******");
        leaftaps.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Charulathamohan.12@gmail.com");
        leaftaps.findElement(By.className("smallSubmit")).click();
        String title = leaftaps.getTitle();
        System.out.println(title);
        leaftaps.findElement(By.partialLinkText("Duplicate Lead")).click();
        leaftaps.findElement(By.id("createLeadForm_companyName")).clear();
        leaftaps.findElement(By.id("createLeadForm_firstName")).clear();
        leaftaps.findElement(By.id("createLeadForm_companyName")).sendKeys("XXXX");
        leaftaps.findElement(By.id("createLeadForm_firstName")).sendKeys("Anu");
        leaftaps.findElement(By.className("smallSubmit")).click();
        System.out.println(title);
	}

}
