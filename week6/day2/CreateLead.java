package week6.day2;






import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethod {
	@BeforeTest
public void input() {
		excelFile="CreateLead";
	}
@Test(dataProvider = "fetchData")
	public void createLead(String cname,String fname,String lname,String pnum) {
	
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
    driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(cname);
    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(fname);
    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(lname);
    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
    driver.findElement(By.className("smallSubmit")).click();
}

	
}






