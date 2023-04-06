package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MovieTickets {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver movietickets = new ChromeDriver(options);
		movietickets.get("https://in.bookmyshow.com/");
		movietickets.manage().window().maximize();
		movietickets.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		movietickets.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		movietickets.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']")).click();
		movietickets.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("Pathaan");
		movietickets.findElement(By.xpath("//div[@class='sc-fFTYTi kXEckc']")).click();
		movietickets.findElement(By.xpath("(//div[@class='styles__CtaText-sc-1vmod7e-2 bBLrVT'])[1]")).click();
		movietickets.findElement(By.xpath("(//div[@class='sc-vhz3gb-3 dRokFO'])[1]")).click();
		String theatre = movietickets.findElement(By.xpath("//a[@class='showtime-pill']")).getText();
		System.out.println(theatre);
		movietickets.findElement(By.xpath("(//div[@class='venue-info-text'])[1]")).click();
		String facility= movietickets.findElement(By.xpath("//div[contains(text(),'Parking Facility')]")).getText();
		System.out.println(facility);
		movietickets.findElement(By.xpath("//div[@class='cross-container']")).click();
		movietickets.findElement(By.xpath("(//div[@class='__text'])[3]")).click();
		movietickets.findElement(By.xpath("//div[@id='btnPopupAccept']")).click();
        movietickets.findElement(By.xpath("//li[@id='pop_1']")).click();
        movietickets.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
        movietickets.findElement(By.xpath("//div[@id='B_3_021']")).click();
        movietickets.findElement(By.xpath("(//span[@id='btnSTotal_reserve'])[1]")).click();
        movietickets.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
        String subtotal =movietickets.findElement(By.xpath("//span[@id='subTT']")).getText();
        System.out.println(subtotal);
	}

}
