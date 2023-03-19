package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		System.out.println(driver.getTitle());
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindow.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(listWindow.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> listWindow1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(listWindow1.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(listWindow1.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(listWindow1.get(0));
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> listWindow2=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(listWindow2.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(listWindow2.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(listWindow2.get(3));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(listWindow2.get(0));
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> listWindow3=new ArrayList<String>(windowHandles3);
		driver.switchTo().window(listWindow3.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(listWindow3.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(3000);
		driver.quit();
	}

}
