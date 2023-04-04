package snowProjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.sukgu.Shadow;



public class ProjectSpecifcMethod {
	public ChromeDriver driver;
	public Shadow shadow;
	public String excelFile;
	@Parameters({"url","uname","pwd"})
	@BeforeMethod
public void precondition(String url,String uname,String pwd) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("user_name")).sendKeys(uname);
	driver.findElement(By.id("user_password")).sendKeys(pwd);
	driver.findElement(By.id("sysverb_login")).click();
	
}
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		String[][] inputData= ReadData.inputData(excelFile);
		return inputData;
	}
}
