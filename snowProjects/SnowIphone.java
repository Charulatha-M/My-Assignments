package snowProjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class SnowIphone extends ProjectSpecifcMethod {
	@Test
	public void phone() throws InterruptedException {
		Shadow shadow =new Shadow(driver);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//div[@id='all']").click();
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 6s']")).click();
		WebElement color = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
		Select drop1 = new Select(color);
		drop1.selectByVisibleText("Gold");
		Thread.sleep(3000);
		WebElement memory = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[3]"));
		Select drop2=new Select(memory);
		drop2.selectByValue("onetwentyeight");
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		String text2 = driver.findElement(By.xpath("//span[text()='Thank you, your request has been submitted']")).getText();
		System.out.println(text2);
		String text = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println("Request id is : "+text);
		
		
		
	}
}
