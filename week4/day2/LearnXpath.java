package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

		// syntax for implicitlywait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// if the element has the wrong syntax --it will throws invalidSelector
		// Exception

		// driver.findElement(By.xpath("//input[@class'inputLogin']")).sendKeys("demosalesmanager");

		// if the element has the invalid value --it will throws noSuchElementException

		WebElement userName = driver.findElement(By.xpath("//input[@class='inputLogin']"));

		userName.sendKeys("demo");

		// thread.sleep() --> it is a java wait
		//

		userName.clear();
		Thread.sleep(1000);
		userName.sendKeys("DemoCSR");

		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");

		// driver.findElement(By.xpath("(//input)[3]")).click();

		// Element Click Intercepted Exception

		WebElement loginButton = driver.findElement(By.xpath("(//input)[3]"));

		driver.executeScript("arguments[0].click();", loginButton);

		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Vinoth");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S");

		WebElement dropDown = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));

		Select source = new Select(dropDown);

		// selectBYIndex

		source.selectByIndex(3);

		Thread.sleep(1000);
		source.selectByVisibleText("Employee");

		Thread.sleep(1000);
		source.selectByValue("LEAD_DIRECTMAIL");

		WebElement abc = driver.findElement(By.xpath("//a[contains(@class,'_3Co')]"));


	}

}
