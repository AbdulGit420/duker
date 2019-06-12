import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewNone\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement g = driver.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
		
		JavascriptExecutor h=(JavascriptExecutor) driver;
		h.executeScript("arguments[0].scrollIntoView(true)",g);
		TakesScreenshot tk=(TakesScreenshot) driver;
		File shot = tk.getScreenshotAs(OutputType.FILE);
		File d=new File("E:\\New folder (2)\\Task4.png");
		FileUtils.copyFile(shot, d);
		

}}
