package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchWindows {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.irctc.co.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.partialLinkText("FLIGHTS")).click();
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
	driver.quit();
}
}
