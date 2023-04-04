package snowProjects;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class SnowKnowledge extends ProjectSpecifcMethod {
	@BeforeTest
	public void know() {
		excelFile="SnowKnowledge";
	}
	@Test(dataProvider = "fetchData")
	public void knowledge(String base,String desc) throws InterruptedException {
	Shadow shadow = new Shadow(driver);
	shadow.setImplicitWait(20);
	shadow.findElementByXPath("//div[text()='All']").click();
	WebElement filter = shadow.findElementByXPath("//input[@id='filter']");
	shadow.setImplicitWait(10);
	filter.click();
	filter.sendKeys("Knowledge",Keys.ENTER);
	Thread.sleep(3000);
	WebElement eleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(eleFrame);
	driver.findElement(By.xpath("//span[@class='btn-icon icon-article-document homepage-icon']")).click();
	driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']")).sendKeys(base);
	driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys(desc);
	driver.findElement(By.xpath("(//span[@class='icon icon-search'])[2]")).click();
	//WebElement category = driver.findElement(By.xpath("//iframe[@id='AC.kb_knowledge.kb_knowledge_base_shim']"));
	//driver.switchTo().frame(category);
	driver.findElement(By.xpath("(//div[@class='list-item arrow'])[4]/span")).click();
	driver.findElement(By.xpath("//span[text()='Java']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary category-ok-btn']")).click();
	driver.findElement(By.xpath("//button[@id='sysverb_insert']")).click();
	Thread.sleep(3000);

}
}
