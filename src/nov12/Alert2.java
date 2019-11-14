package nov12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert2 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		//click on button
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		Thread.sleep(5000);
		
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
	Thread.sleep(5000);
	
	//get the alert message
	
	Alert alert=driver.switchTo().alert();
	String message=alert.getText();
	System.out.println("message is :"+message);
	Thread.sleep(5000);
	
	// send some text in alert box
	
	alert.sendKeys("Hello geeta welcome to selenium");
	
	Thread.sleep(5000);
	
	// accept the alert
	
	alert.accept();
	
	//get the text displayed in webpage
	
	String webmessage=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/p")).getText();
	System.out.println("web message is ::"+webmessage);
	
	Thread.sleep(5000);
	
	driver.close();
	

	}

}

