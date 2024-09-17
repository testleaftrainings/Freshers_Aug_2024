package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) {

		// to launch the browser
		ChromeDriver driver = new ChromeDriver();

		// to maximize the window
		driver.manage().window().maximize();

		// to load the url
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.linkText("Create new account")).click();

		driver.findElement(By.name("firstname")).sendKeys("TestLeaf");

	}

}
