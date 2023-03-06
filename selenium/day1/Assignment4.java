package selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/select.xhtml");
	driver.manage().window().maximize();
	WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
	Select drop1=new Select(tool);
	drop1.selectByVisibleText("Playwright");
	driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[1]")).click();
	driver.findElement(By.id("j_idt87:country_3")).click();
	driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();
	driver.findElement(By.xpath("//li[text()='Tamil']")).click();
	driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
	driver.findElement(By.xpath("//li[text()='Playwright']")).click();
	
		}

}
