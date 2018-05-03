package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class TestNGReport {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "http://www.google.com";
		driver.get(URL);

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		allLinks.size();
		Reporter.log("Print all the links" + allLinks.size());
		driver.quit();
		
	}
	
	
}
