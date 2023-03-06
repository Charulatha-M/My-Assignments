package selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

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
        WebElement source = leaftaps.findElement(By.id("createLeadForm_dataSourceId"));
        Select drop1=new Select(source);
        drop1.selectByVisibleText("Employee");
      WebElement mcampaign = leaftaps.findElement(By.id("createLeadForm_marketingCampaignId"));        
        Select drop2=new Select(mcampaign);
        drop2.selectByValue("9001");
        leaftaps.findElement(By.className("smallSubmit")).click();
        String title = leaftaps.getTitle();
        System.out.println(title);
	}

}
