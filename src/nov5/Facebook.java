package nov5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Facebook {

	public static void main(String[] args) throws Throwable {
		//WebDriver d=new ChromeDriver();
		HtmlUnitDriver d=new HtmlUnitDriver();
		d.get("https://www.facebook.com");
		d.manage().window().maximize();
		String title=d.getTitle();
		System.out.println("page title is::"+title);
		System.out.println("page title is::"+title.length());
		
		String url=d.getCurrentUrl();
		System.out.println("url of the page::"+url);
		System.out.println("url of the page::"+url.length());
		
		/*d.findElement(By.name("firstname")).sendKeys("Subhapriya");
		d.findElement(By.name("lastname")).sendKeys("Mohanty");
		d.findElement(By.name("reg_email__")).sendKeys("9778997225");
		d.findE	lement(By.name("reg_passwd__")).sendKeys("subhageeta123");
		d.findElement(By.name("birthday_day")).sendKeys("28");
		d.findElement(By.name("birthday_month")).sendKeys("Oct");
		d.findElement(By.name("birthday_year")).sendKeys("1990");
		d.findElement(By.name("sex")).click();
		d.findElement(By.name("websubmit")).click();*/
		
		Thread.sleep(5000);
		d.close();

	}

}
