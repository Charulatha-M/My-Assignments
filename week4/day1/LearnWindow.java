package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindow {
 public static void main(String[] args) {
	 
	 ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		//To disable the notification
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//click the element
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//Print the  active window address
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		//1D21D735AF9FF7DFBEC4B829F9F264D4
		//56B2938B7097E605AF05B450FB096993
		//verify the window
		System.out.println(driver.getTitle());
		
		//How can i print second window title
		
		//step1:
		Set<String> windowHandles = driver.getWindowHandles();
		//step2 convert set into list
		List<String> listWindow=new ArrayList<String>(windowHandles);
		//Step3
		driver.switchTo().window(listWindow.get(1));
		//verify the window present in dashboard
		System.out.println(driver.getTitle());
		//close the current open window
		driver.close();
		//switch back to the main window
		driver.switchTo().window(listWindow.get(0));
		System.out.println(driver.getTitle());
		//close all the open window
		driver.quit();
 }
}
