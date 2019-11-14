package nov14;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc_Windowhandle_Iterator {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		System.out.println("parent id:"+parent);
		
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println("all window id is:"+allwindows);
		Iterator<String>x=allwindows.iterator();
		while(x.hasNext())
		{
			String Child=x.next();
			
			if(!parent.equals(Child))
			{
				String Pagetitle=driver.switchTo().window(Child).getTitle();
				System.out.println("pagetitle");
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		driver.close();

	}

}

