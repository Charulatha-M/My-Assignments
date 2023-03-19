package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlert {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert prompt = driver.switchTo().alert();
		String text = prompt.getText();
		System.out.println(text);
		prompt.sendKeys("Charulatha");
		Thread.sleep(3000);
		prompt.accept();
		Thread.sleep(3000);
		String text2 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text2);
	}

}
