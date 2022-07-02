package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASK\\eclipse-workspace\\JavaProjects\\SeleniumSession\\Drivers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.airindia.in/");
		
		//Movemovement done by action class
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Manage"))).build().perform();
		Thread.sleep(3000);
		System.out.println("After Action class");
	}

}
