package SeleniumPractices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASK\\eclipse-workspace\\JavaProjects\\SeleniumSession\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		
		//Handling Java script Alert  and popup
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
	
		//alert.dismiss();
		
		String Alerttext =  alert.getText();
		if(Alerttext.equals("Please enter a valid user name")) {
			
			System.out.println("Correct alert message");
		}else {
			
			System.out.println("Incorrect alert  message");
		}
			
		alert.accept();
		driver.quit();
		
	}

}
