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

public class Task5 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewNone\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement hj = driver.findElement(By.xpath("//a[text()='Infosys BPM ']"));
		JavascriptExecutor fd=(JavascriptExecutor) driver;
		fd.executeScript("arguments[0].scrollIntoView(true)", hj);
		TakesScreenshot tk=(TakesScreenshot) driver;
		File fot = tk.getScreenshotAs(OutputType.FILE);
		File d=new File("E:\\New folder (2)\\tas5.png");
		FileUtils.copyFile(fot, d);
		WebElement as = driver.findElement(By.xpath("//h1[text()='Selenium Training in Chennai']"));
		fd.executeAsyncScript("arguments[0].scrollIntoView(false)", as);
		
}}
