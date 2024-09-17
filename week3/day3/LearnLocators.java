package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("Democsr");

		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.tagName("a"));

	}
}
