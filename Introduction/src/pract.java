import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;

public class pract {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak143\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/");
		
		WebElement column=driver.findElement(By.xpath("//ul[1][@class='unstyled-list link-column']"));
		
		for(int i=1;i<=column.findElements(By.tagName("a")).size();i++)
		{
			String newtab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(newtab);
			Thread.sleep(3000);
			 
		}
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
			
		}

	

}
