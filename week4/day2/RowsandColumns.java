package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RowsandColumns {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get(" https://html.com/tags/table/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	List<WebElement> rowCount = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
	System.out.println("Row Count : "+rowCount.size());
	
	List<WebElement> column = driver.findElements(By.xpath("//table[@class='attributes-list']//tr/td"));
	System.out.println("Column Count: "+column.size());

    }
}

