package selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {
public static void main(String[] args) {
	ChromeDriver leaftaps=new ChromeDriver();
	leaftaps.get("http://leaftaps.com/opentaps/control/login");
	leaftaps.manage().window().maximize();
	leaftaps.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	leaftaps.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	leaftaps.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

	
}
}
