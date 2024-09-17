package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicit {

	public static void main(String[] args) {

		// to launch the browser
		ChromeDriver driver = new ChromeDriver();

		// to maximize the window
		driver.manage().window().maximize();

		// to load the url
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("Democsr");

		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.tagName("a"));

	}
}
