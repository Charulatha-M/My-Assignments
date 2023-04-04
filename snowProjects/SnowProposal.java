package snowProjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class SnowProposal extends ProjectSpecifcMethod {
	@BeforeTest
 public void propose() {
		excelFile= "SnowProposal";
	}
	@Test(dataProvider = "fetchData")
	public void proposal(String desc) throws InterruptedException {
	Shadow shadow = new Shadow(driver);
	shadow.setImplicitWait(20);
	shadow.findElementByXPath("//div[text()='All']").click();
	WebElement filter = shadow.findElementByXPath("//input[@id='filter']");
	shadow.setImplicitWait(10);
	filter.click();
	filter.sendKeys("My Proposal",Keys.ENTER);
	//shadow.findElementByXPath("//mark[text()='My Proposal']").click();
	Thread.sleep(3000);
	WebElement eleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(eleFrame);
	driver.findElement(By.xpath("//button[text()='New']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(desc);
	Thread.sleep(10);
	driver.findElement(By.xpath("//span[@class='ui_action_container_primary']//button[text()='Submit']")).click();
	List <WebElement> proposal= driver.findElements(By.xpath("//table[@id='std_change_proposal_table']//tr/td"));
	for(int i=1;i<proposal.size();i++) {
		String text = proposal.get(i).getText();
		System.out.println(text);
	}
}

}
