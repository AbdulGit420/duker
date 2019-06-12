import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewNone\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement btn = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		btn.sendKeys("motorolo");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement w1 = driver.findElement(By.xpath("//span[text()='Motorola Moto E4 (Iron Grey, 2GB RAM, 16GB Storage)']"));
		w1.click();
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String s : child) {
			if (!parent.equals(s)) {
				driver.switchTo().window(s);
				
			}
			
		}
		System.out.println("Your Phone selected Enjoy");
		
		
	}

}
