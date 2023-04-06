package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver amazon=new ChromeDriver();
	amazon.get("https://www.amazon.in/");
	amazon.manage().window().maximize();
	amazon.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    amazon.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
    amazon.findElement(By.xpath("//span[text()=' for boys']")).click();
    String results =amazon.findElement(By.xpath("//span[@class='a-size-base a-color-secondary a-text-normal']")).getText();
    System.out.println(results);
    amazon.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::i)[3]")).click();
    amazon.findElement(By.xpath("//li[@id='p_89/DZert']/span[1]/a[1]/div[1]/label[1]/i[1]")).click();
    amazon.findElement(By.xpath("//span[@class='a-dropdown-label']")).click();
    amazon.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
    String price = amazon.findElement(By.xpath("//span[text()='239']")).getText();
    System.out.println("Price of the first bag is: " +price);
    String title = amazon.getTitle();
    System.out.println("Title of the resulting page " +title);
    Thread.sleep(3000);
    amazon.close();
    
    
}
}
