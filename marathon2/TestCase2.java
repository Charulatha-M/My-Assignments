package marathon2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 extends ProjectSpecificMethod {
	@BeforeTest
	public void input() {
		excelFile="Oppurtunities";
	}
	@Test(dataProvider = "fetchData")
public void oppurtunites(String opp, String amt) {
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	WebElement scroll = driver.findElement(By.xpath("(//a[@class='viewAllLink'])[4]"));
	Actions builder = new Actions(driver);
	builder.scrollToElement(scroll).perform();
	WebElement deals = driver.findElement(By.xpath("(//a[@class='viewAllLink'])[4]"));
	driver.executeScript("arguments[0].click();",deals);
	driver.findElement(By.xpath("//div[text()='New']")).click();
	driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys(opp);
	driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]")).click();
	driver.findElement(By.xpath("(//span[text()='New Customer'])[1]")).click();
	driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]")).click();
	driver.findElement(By.xpath("(//span[text()='Partner Referral'])[1]")).click();
	driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(amt);
	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	driver.findElement(By.xpath("//td[@data-value='2023-04-07']")).click();
	driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]")).click();
	driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[2]")).click();
	driver.findElement(By.xpath("//span[text()='test']")).click();
	driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
    String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
    System.out.println(text);
}
}
