package testingBaba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {
	
	
	@Test
	public void lunchUrl()
	{
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	}

}
