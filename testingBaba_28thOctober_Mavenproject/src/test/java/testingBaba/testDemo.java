package testingBaba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testDemo {
	
	@Test
	public void lunchUrl() 
	{

		WebDriver driver = new EdgeDriver();
		driver.get("https://testingbaba.com/old/");
	}

}
