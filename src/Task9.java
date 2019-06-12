import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
	 public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "G:\\NewNone\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
			
			WebElement BtnSearch = driver.findElement(By.xpath("//input[@type='text']"));
			BtnSearch.sendKeys("iPhone");
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			WebElement phn1 = driver.findElement(By.xpath("//div[text()='Apple iPhone 6s (Rose Gold, 32 GB)']"));
			phn1.click();
			String w1 = driver.getWindowHandle();
			Set<String> w2 = driver.getWindowHandles();
			for (String s : w2) {
				if(!w1.equals(w2));
				driver.switchTo().window(s);
				
			}
			
			TakesScreenshot tk=(TakesScreenshot) driver;
			File s = tk.getScreenshotAs(OutputType.FILE);
			File d=new File("E:\\task9.png");
			FileUtils.copyFile(s, d);
			System.out.println("Thank you...!Screen shot saved in your location");
	}

}
