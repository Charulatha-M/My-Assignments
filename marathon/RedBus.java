package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver redbus = new ChromeDriver(options);
		redbus.get("https://www.redbus.in/");
		redbus.manage().window().maximize();
		redbus.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		redbus.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		redbus.findElement(By.xpath("(//li[@class='sub-city'])[1]")).click();
		redbus.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		redbus.findElement(By.xpath("//li[@data-id='122']")).click();
		redbus.findElement(By.xpath("//td[text()='10']")).click();
		redbus.findElement(By.xpath("//button[@id='search_btn']")).click();
		String result =redbus.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		System.out.println(result);
		redbus.findElement(By.xpath("//label[text()='SLEEPER']")).click();
		String results =redbus.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		System.out.println(results);
		String title= redbus.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		redbus.close();
		
	}

}
