package SeleniumPractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//Launch firefox driver
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASK\\eclipse-workspace\\JavaProjects\\SeleniumSession\\Drivers\\geckodriver.exe");
//		WebDriver driver =new FirefoxDriver();
//		
		//Launch Chrome Driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASK\\eclipse-workspace\\JavaProjects\\SeleniumSession\\Drivers\\chromedriver.exe");
		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://www.google.co.in/");
		//String title = driver1.getTitle();
		//System.out.println(title);
		System.out.println(driver1.getTitle());
		
		//Validation point
		if(driver1.getTitle().equals("Google")) {
			System.out.println("Correct Title");
			
		}else {
			System.out.println("In Correctr Title");
		}
			
		System.out.println(driver1.getCurrentUrl());
		//System.out.println(driver1.getPageSource());
		driver1.close();
		//driver1.quit();

	}

}
