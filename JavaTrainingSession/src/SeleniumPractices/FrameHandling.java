package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASK\\eclipse-workspace\\JavaProjects\\SeleniumSession\\Drivers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/default.asp");
		driver.findElement(By.linkText("Python Tutorial")).click();;
		
	
	}

}
