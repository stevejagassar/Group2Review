import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AzharNewTours {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");

		WebElement userName = driver.findElement(By.xpath("//*[@name='userName']"));
		userName.sendKeys("azharbaig");

		WebElement pass = driver.findElement(By.xpath("//*[@name='password']"));
		pass.sendKeys("azharbaig");

		WebElement login = driver.findElement(By.xpath("//*[@value='Login']"));
		login.click();

		Thread.sleep(2000);
		driver.navigate().back();

		WebElement user = driver.findElement(By.xpath("//*[@name='userName']"));
		user.sendKeys("azharbaig@gmail.com");


		WebElement passowrd = driver.findElement(By.xpath("//*[@name='password']"));
		passowrd.sendKeys("smarttech");


		WebElement logins = driver.findElement(By.xpath("//*[@name='login']"));
		logins.click();


		}

}
