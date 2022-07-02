package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASK\\eclipse-workspace\\JavaProjects\\SeleniumSession\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F");
		driver.findElement(By.id("businessaccount-radio")).click();
		driver.findElement(By.name("businessName")).sendKeys("Mani");
		driver.findElement(By.name("businessEmail")).sendKeys("c02@mail.com");
		driver.findElement(By.id("bizPassword")).sendKeys("A@123456");
		
		//handle dropdown
		Select s = new Select(driver.findElement(By.id("businessCountry")));
		s.selectByValue("GB");
		
		driver.findElement(By.name("bizOnlyToBuy")).click();
		//driver.findElement(By.id("bizPassword")).click();

	}

}
