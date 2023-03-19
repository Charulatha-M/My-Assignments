package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContacts {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.partialLinkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
    driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif'][1]")).click();
    Set<String> windowHandles = driver.getWindowHandles();
    List<String> listWindow= new ArrayList<String>(windowHandles);
    driver.switchTo().window(listWindow.get(1));
    System.out.println(driver.getTitle());
    driver.findElement(By.xpath("//a[@class='linktext']")).click();
    driver.switchTo().window(listWindow.get(0));
    driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
    Set<String> windowHandles1 = driver.getWindowHandles();
    List<String> listWindow1= new ArrayList<String>(windowHandles1);
    driver.switchTo().window(listWindow1.get(1));
    System.out.println(driver.getTitle());
    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
    driver.switchTo().window(listWindow.get(0));
    System.out.println(driver.getTitle());
    driver.findElement(By.xpath("//a[text()='Merge']")).click();
    Alert confirm = driver.switchTo().alert();
    confirm.getText();
    confirm.accept();
    System.out.println(driver.getTitle());
}
}
