package marathon2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 extends ProjectSpecificMethod{
	@BeforeTest
	public void input() {
		excelFile="Chatter";
	}
	@Test(dataProvider = "fetchData")
public void chatter(String question,String more) throws InterruptedException {
	driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Content");
	driver.findElement(By.xpath("//mark[text()='Content']")).click();
	Thread.sleep(3000);
	WebElement chatter = driver.findElement(By.xpath("//span[text()='Chatter']"));
    driver.executeScript("arguments[0].click();",chatter);
    String title = driver.getTitle();
    System.out.println(title);
    driver.findElement(By.xpath("//span[text()='Question']")).click();
    driver.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys(question);
    driver.findElement(By.xpath("//div[@class='ql-editor ql-blank slds-rich-text-area__content slds-text-color_weak slds-grow']")).sendKeys(more);
    driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand cuf-publisherShareButton qe-questionPostDesktop MEDIUM']")).click();
    String text = driver.findElement(By.xpath("//div[@class='cuf-body cuf-questionTitle forceChatterFeedBodyQuestionWithoutAnswer']")).getText();
    System.out.println(text);

}
}
