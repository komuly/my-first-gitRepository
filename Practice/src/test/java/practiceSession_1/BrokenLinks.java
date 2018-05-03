package practiceSession_1;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, Exception {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("http://musabaytechnologies.com/");
		// driver.get("http://www.amazon.com/");
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));

		System.out.println("size of full links and images---->" + linksList.size());

		List<WebElement> activeLinks = new ArrayList<WebElement>();

		for (int i = 0; i < linksList.size(); i++) {

			// System.out.println(linksList.get(i).getAttribute("href"));

			if (linksList.get(i).getAttribute("href") != null) {
				// &&
				// (!linksList.get(i).getAttribute("href").contains("javascript")))

				activeLinks.add(linksList.get(i));

			}
			System.out.println("size of active links and images---->" + activeLinks.size());

			/*
			 * for (int j = 0; j < activeLinks.size(); j++) { HttpURLConnection
			 * connection = (HttpURLConnection) new
			 * URL(activeLinks.get(j).getAttribute("href")) .openConnection();
			 * 
			 * connection.connect(); String response =
			 * connection.getResponseMessage();// 200-OK
			 * connection.disconnect();
			 * System.out.println(activeLinks.get(j).getAttribute("href") +
			 * "--->" + response); }
			 */
		}

		driver.quit();
	}
}
