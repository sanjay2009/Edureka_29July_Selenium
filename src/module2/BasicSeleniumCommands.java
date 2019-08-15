package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumCommands {

	public static void main(String[] args) {
		
		//Initiate browser
		System.setProperty("webdriver.chrome.driver", "D:\\Sanjay\\Edreka\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.quit();
		
	}

}
