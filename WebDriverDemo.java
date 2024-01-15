import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {
public static void main (String[] args)throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION TOOLS\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://careercenter.tops-int.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.id("mobile")).sendKeys("8238780006");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("9825165067");
	Thread.sleep(2000);
	driver.findElement(By.id("submit")).click();
	Thread.sleep(2000);
	

	driver.close();
}
}
