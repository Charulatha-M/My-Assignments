package week4.day2;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTable {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU",Keys.ENTER);
        driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
        WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
        List<WebElement> rowcount = table.findElements(By.tagName("tr"));
        System.out.println(rowcount.size());
        List<WebElement> column = table.findElements(By.tagName("th"));
        System.out.println(column.size());
   List<WebElement> trainames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
               int size = trainames.size();   
               System.out.println(size);
	    for(int i=1; i<trainames.size();i++) {
	    	String text = trainames.get(i).getText();
	    	System.out.println(text);	
	    }
	    Set<String> duplicate= new HashSet(trainames);
	    int size2 = duplicate.size();
	    System.out.println(size2);
	    if(trainames.size()==duplicate.size()) {
	    	System.out.println("Duplicate Found");
	    }
	    else {
	    	System.out.println("No Duplicate");
	    }
	}

	
}
