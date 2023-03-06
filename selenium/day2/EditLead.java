package selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver editlead=new ChromeDriver();
		editlead.get("http://leaftaps.com/opentaps/control/login");
		editlead.manage().window().maximize();
		editlead.findElement(By.id("username")).sendKeys("demosalesmanager");
		editlead.findElement(By.id("password")).sendKeys("crmsfa");
        editlead.findElement(By.className("decorativeSubmit")).click();
        editlead.findElement(By.partialLinkText("CRM/SFA")).click();
        editlead.findElement(By.linkText("Leads")).click();
        editlead.findElement(By.xpath("//a[text()='Find Leads']")).click();
        editlead.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Charulatha");
        editlead.findElement(By.xpath("//button[text()='Find Leads']")).click();
        editlead.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=15292'])[1]")).click();
        String title = editlead.getTitle();
        System.out.println(title);
		editlead.findElement(By.xpath("//a[text()='Edit']")).click();
		editlead.findElement(By.id("updateLeadForm_companyName")).clear();
		editlead.findElement(By.id("updateLeadForm_companyName")).sendKeys("iOPEX");
		editlead.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
        Thread.sleep(3000);
        editlead.close();
	}

}
