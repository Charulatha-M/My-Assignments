package selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver deletelead=new ChromeDriver();
		deletelead.get("http://leaftaps.com/opentaps/control/login");
		deletelead.manage().window().maximize();
		deletelead.findElement(By.id("username")).sendKeys("demosalesmanager");
		deletelead.findElement(By.id("password")).sendKeys("crmsfa");
        deletelead.findElement(By.className("decorativeSubmit")).click();
        deletelead.findElement(By.partialLinkText("CRM/SFA")).click();
        deletelead.findElement(By.linkText("Leads")).click();
        deletelead.findElement(By.xpath("//a[text()='Find Leads']")).click();
        deletelead.findElement(By.xpath("//span[text()='Phone']")).click();
        deletelead.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9840820082");
        deletelead.findElement(By.xpath("//button[text()='Find Leads']")).click();
         System.out.println("The Captured Lead id is 15664");        
        deletelead.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=15664']")).click();
        deletelead.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
        Thread.sleep(3000);
        deletelead.findElement(By.xpath("//a[text()='Find Leads']")).click();
        deletelead.findElement(By.xpath("//input[@name='id']")).sendKeys("15664");
        deletelead.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(3000);
        String text2 = deletelead.findElement(By.className("x-paging-info")).getText();
        if(text2.contains("No")) {
			System.out.println("Record is deleted");
		}
		else
			System.out.println("Record is not deleted");
			
		}
		
        
   
        
        
	}


