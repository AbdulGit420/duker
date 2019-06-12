import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewNone\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement sa = driver.findElement(By.xpath("//a[text()=' Day6_Robot class-ContextClick-DoubleClick']"));
		sa.click();
		String w1 = driver.getWindowHandle();
		Set<String> w2 = driver.getWindowHandles();
		for (String s : w2) {
			if (!s.equals(w1)) {
				driver.switchTo().window(s);
				
			}
			
		}
		
		

}}
