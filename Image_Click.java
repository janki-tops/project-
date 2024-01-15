import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image_Click {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION TOOLS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tops-int.com/java-training-course");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class=navbar-brand]")).click();
		Thread.sleep(10000);
		driver.close();	
		
	}
}
