import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewNone\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='close']")).click();
		WebElement scro = driver.findElement(By.xpath("//h2[text()='Best Selenium training institute in Adyar']"));
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true)", scro);
		Thread.sleep(5000);
		TakesScreenshot tk=(TakesScreenshot) driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File d=new File("E:\\New folder(2)\\task6.png");
		FileUtils.copyFile(s, d);
		WebElement fo = driver.findElement(By.xpath("//h1[text()='Selenium Training in Chennai']"));
		j.executeScript("arguments[0].scrollIntoView(false)", fo);
		
}}
