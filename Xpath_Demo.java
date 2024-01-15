import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Demo {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION TOOLS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String data=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/h4[1]/b")).getText();
		//String data=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/h4[1]/b")).getText();
		System.out.println(data);
		Thread.sleep(10000);
		driver.close();			
	}
}
