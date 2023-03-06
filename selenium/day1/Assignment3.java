package selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		ChromeDriver leaftaps=new ChromeDriver();
		leaftaps.get("http://leaftaps.com/opentaps/control/login");
		leaftaps.manage().window().maximize();
		leaftaps.findElement(By.id("username")).sendKeys("demosalesmanager");
		leaftaps.findElement(By.id("password")).sendKeys("crmsfa");
        leaftaps.findElement(By.className("decorativeSubmit")).click();
        leaftaps.findElement(By.partialLinkText("CRM/SFA")).click();
        leaftaps.findElement(By.linkText("Accounts")).click();
        leaftaps.findElement(By.linkText("Create Account")).click();
        leaftaps.findElement(By.id("accountName")).sendKeys("Credit Limited Account");
        leaftaps.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        leaftaps.findElement(By.id("groupNameLocal")).sendKeys("Charu");
        leaftaps.findElement(By.id("officeSiteName")).sendKeys("XXX");
        //leaftaps.findElement(By.id("annualRevenue")).sendKeys("C");
        WebElement industry = leaftaps.findElement(By.name("industryEnumId"));
        Select drop1=new Select(industry);
        drop1.selectByVisibleText("Computer Software");
        WebElement ownership = leaftaps.findElement(By.name("ownershipEnumId"));
        Select drop2=new Select(ownership);
        drop2.selectByVisibleText("S-Corporation");
        WebElement source = leaftaps.findElement(By.id("dataSourceId"));
        Select drop3=new Select(source);
        drop3.selectByValue("LEAD_EMPLOYEE");
        WebElement mcampaign = leaftaps.findElement(By.id("marketingCampaignId"));
        Select drop4=new Select(mcampaign);
        drop4.selectByIndex(4);
        WebElement state = leaftaps.findElement(By.id("generalStateProvinceGeoId"));
        Select drop5=new Select(state);
        drop5.selectByValue("TX");
        leaftaps.findElement(By.className("smallSubmit")).click();

	}

}
