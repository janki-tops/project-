import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo {
	public static void main (String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION TOOLS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("janki10soni@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("J@nki09soni");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_5_Hc")).click();
		Thread.sleep(2000);
		
		
		driver.close();
	}
}
