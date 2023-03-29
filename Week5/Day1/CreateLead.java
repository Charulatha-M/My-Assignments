package Week5.Day1;




import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethod {
@Test(dataProvider = "fetchData")
	public void createLead(String cname,String fname,String lname,String pnum) {
	
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
    driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(cname);
    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(fname);
    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(lname);
    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
    driver.findElement(By.className("smallSubmit")).click();
}
@DataProvider(name="fetchData")
public String[][] getdata() {
    String [][] data =new String[2][4];
    //1st set
    data[0][0]="CTS";
    data[0][1]="Princila";
    data[0][2]="Edward";
    data[0][3]="99";
    
    //2nd set
        data[1][0]="Qeagle";
        data[1][1]="Babu";
        data[1][2]="M";
        data[1][3]="98";
    
    return data;
}
}






