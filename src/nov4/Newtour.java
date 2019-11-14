package nov4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtour {

	public static void main(String[] args) throws Throwable{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("REGISTER")).click();;
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("Geetanjali");;
		driver.findElement(By.name("lastName")).sendKeys("Mohanty");
		driver.findElement(By.name("phone")).sendKeys("9778584520");
		driver.findElement(By.name("userName")).sendKeys("geet.geetanjali90@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("BBSR");
		driver.findElement(By.name("address2")).sendKeys("Patia");
		driver.findElement(By.name("city")).sendKeys("Bbsr");
		driver.findElement(By.name("state")).sendKeys("Odisha");
		driver.findElement(By.name("postalCode")).sendKeys("769009");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		driver.findElement(By.name("email")).sendKeys("geetu");
		driver.findElement(By.name("password")).sendKeys("9778997225");
		driver.findElement(By.name("confirmPassword")).sendKeys("9778997225");
		driver.findElement(By.name("register")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("SIGN-ON")).click();
		/*Thread.sleep(5000);
		driver.findElement(By.name("userName")).sendKeys("geet.geetanjali90@gmail.com");
		driver.findElement(By.name("password")).sendKeys("9778997225");
		driver.findElement(By.name("login")).click();*/
		driver.quit();
		
		
		
		

		
	}

}
