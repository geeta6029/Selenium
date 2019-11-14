package nov12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert1 {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		// click on login button
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		
		//get alert message
		
		Alert alert=driver.switchTo().alert();
		
		String alertmessage=alert.getText();
		
		Thread.sleep(5000);
		
		System.out.println("alert message is::"+alertmessage);
		
		Thread.sleep(5000);
		
		// accept the alert
		
		alert.accept();
		
		Thread.sleep(5000);
		
		
		driver.close();
		
	

	}

}
