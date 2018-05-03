package practiceSession_1;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeliniumPractice {

	public static void main(String[] args) {
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		System.setProperty("webdriver.ie.driver", "src/test/recources/IEDriverServer.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("internetExplorer");//InternetExplorer();
		
		capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		
		//driver=new InternetExplorerDriver(capabilities);
		//ChromeDriver():
		
		
	} 
	
}
