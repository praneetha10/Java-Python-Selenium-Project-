package PracticeWebsite;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonInteractions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver. get("https://www.sreenidhirajakrishnan.com/practice?utm_source");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Button Interactions']")).click();
		//Single click
		WebElement msg=  driver.findElement(By.xpath("//div //p[text()='No click yet']"));
		
		Assert.assertEquals(msg.getText(),"No click yet");
		
		driver.findElement(By.id("single-click-btn")).click();
		
		Assert.assertEquals(msg.getText(),"Single clicked!");
		
		//Double Click
		
		WebElement message=driver.findElement(By.xpath("//div//p[text()='Not double-clicked']"));
		Assert.assertEquals(message.getText(),"Not double-clicked");
		
		WebElement dc=driver.findElement(By.id("double-click-btn"));
		
		
		Actions action=new Actions(driver);
		action.doubleClick(dc).perform();
		
		Assert.assertEquals(message.getText(),"Double clicked!");
		
		// RightClick
		WebElement msg1=driver.findElement(By.xpath("//div//p[text()='Not right-clicked']"));
		Assert.assertEquals(msg1.getText(),"Not right-clicked");
		
		WebElement rightclick=driver.findElement(By.id("right-click-btn"));
		action.contextClick(rightclick).perform();
		
		Assert.assertEquals(msg1.getText(), "Right click captured (context menu blocked)");
		
		Actions actions = new Actions(driver);

		// Left click
		//actions.click(element).perform();

		// Double click
		//actions.doubleClick(element).perform();

		// Right click
		//actions.contextClick(element).perform();

		// Hover
		//actions.moveToElement(element).perform();

		// Drag and Drop
		//actions.dragAndDrop(source, target).perform();
		
		//Button enabled in 3S 
		
		

	}

}
