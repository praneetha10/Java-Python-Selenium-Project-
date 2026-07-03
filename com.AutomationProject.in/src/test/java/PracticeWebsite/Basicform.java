package PracticeWebsite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicform {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		// Open page
			WebDriver driver =new ChromeDriver();
			// maximize window
			driver.manage().window().maximize();
			driver. get("https://www.sreenidhirajakrishnan.com/practice?utm_source");
			//implicit wait
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			System.out.println(driver.getTitle());
			
			// goto session 1
			 driver.findElement(By.xpath("//a[span='Basic Form Elements']")).click();
			 
			 Thread.sleep(2000);
			 //Happy Path
			 driver.findElement(By.name("username")).sendKeys("Joythsna");
			 driver.findElement(By.name("password")).sendKeys("Pranee.120");
			 driver.findElement(By.id("email-input")).sendKeys("1234@com");
			 //driver.findElement(By.id("phone-input")).sendKeys("12345698");
			 driver.findElement(By.id("textarea-input")).sendKeys("this is happy path validation");
			
			 driver.findElement(By.id("form-submit")).click();
		
			 driver.quit();
		}

}
