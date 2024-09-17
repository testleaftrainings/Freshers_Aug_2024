package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownWithoutSelectTag {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/select.xhtml");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// syntax for implicitlywait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//label[text()='Select Country']")).click();

		WebElement element2 = driver.findElement(By.xpath("//li[text()='India']"));
		element2.click();

		element2.sendKeys(Keys.TAB);

		WebElement city = driver.findElement(By.xpath("//label[text()='Select City']"));

		city.click();

		driver.findElement(By.xpath("//li[text()='Chennai']")).click();

//		WebElement course = driver.findElement(By.xpath("//input[@placeholder='Choose Course']"));
//
//		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
//		course.sendKeys("Selenium");
//		driver.findElement(By.xpath("//li[@data-item-value='Selenium WebDriver']")).click();
//		course.sendKeys("Play");
//		Thread.sleep(1000);
//		WebElement element = driver.findElement(By.xpath("//li[@data-item-value='Playwright']"));
//
//		wait.until(ExpectedConditions.stalenessOf(element));
//
		// org.openqa.selenium.StaleElementReferenceException:

	}

}
