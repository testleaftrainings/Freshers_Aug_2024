package week3.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws IOException {
		// to launch the browser
		ChromeDriver driver = new ChromeDriver();

		// to maximize the window
		driver.manage().window().maximize();

		// to load the url
		driver.get("https://uibank.uipath.com/");

		// to get the title of the page
		String title = driver.getTitle();

		// to print the title
		System.out.println(title);

		// System.out.println(driver.getTitle());

	}
}
