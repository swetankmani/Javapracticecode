package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileuploadpopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASK\\eclipse-workspace\\JavaProjects\\SeleniumSession\\Drivers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
	
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASK\\eclipse-workspace\\JavaProjects\\SeleniumSession\\Drivers\\chromedriver.exe");
//		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		System.out.println("Before File upload");
		driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\ASK\\Downloads\\seleniumtest.docx");
	

	}

}
