package nov12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle1 {

	public static void main(String[] args)throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		
		// get parent id of gmail
		
		String parent=driver.getWindowHandle();
		System.out.println("parent id of gmail:"+parent);
		Thread.sleep(5000);
		
		//click help,privacy,terms in gmail
		
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
		//Thread.sleep(5000);
		
		//get collection of all window id
		
		Set<String>allwindow=driver.getWindowHandles();
		System.out.println("all window ids are:"+allwindow);
		
		for(String each:allwindow)
		{
			if(!parent.equals(each))
			{
				String pagetitle=driver.switchTo().window(each).getTitle();
				System.out.println("pagetitle is:"+pagetitle);
				//Thread.sleep(5000);
				driver.close();
				//Thread.sleep(5000);
				
			}
		}
		
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("pradhan.geetanjali89@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
        driver.findElement(By.name("password")).sendKeys("0701216029");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		
		driver.close();
	
	

	}

}
