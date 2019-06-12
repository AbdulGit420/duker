import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewNone\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement htc = driver.findElement(By.xpath("//a[text()='HTC Global Services']"));
		htc.click();
		String w1 = driver.getWindowHandle();
		Set<String> w2 = driver.getWindowHandles();
		for (String s : w2) {
			if (!s.equals(w1)) {
				driver.switchTo().window(s);
				
			}
			
		}
		
		Thread.sleep(4000);
		
		TakesScreenshot tk=(TakesScreenshot) driver;
		File s1 = tk.getScreenshotAs(OutputType.FILE);
		File d=new File("E:\\out.png");
		FileUtils.copyFile(s1, d);

}
}