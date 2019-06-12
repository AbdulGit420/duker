import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewNone\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/");
		//WebElement sco = driver.findElement(By.xpath("//a[text()='SITEMAP']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView(true)", sco);
		
		WebElement up = driver.findElement(By.xpath("(//img[@alt='TOOLSQA'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);
}}
