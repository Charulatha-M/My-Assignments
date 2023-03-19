package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertHandling {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert simple = driver.switchTo().alert();
		String text = simple.getText();
		System.out.println(text);
		simple.accept();
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirm = driver.switchTo().alert();
		String text2 = confirm.getText();
		System.out.println(text2);
        confirm.dismiss();
        driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
        String text3 = driver.findElement(By.xpath("//span[text()='Dismiss']")).getText();
        System.out.println(text3);
        driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
        driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert prompt = driver.switchTo().alert();
		String text4 = prompt.getText();
		System.out.println(text4);
		prompt.sendKeys("Charulatha");
		Thread.sleep(3000);
		prompt.accept();
		Thread.sleep(3000);
		String text5 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text5);
        driver.findElement(By.xpath("//span[text()='Delete']")).click();
        driver.findElement(By.xpath("//span[text()='Yes']")).click();
        driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-extlink']")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.close();
	}
	

}
