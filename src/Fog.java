import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fog {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewNone\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("http://www.greenstechnologys.com/");
		//type Cast
		TakesScreenshot tk=(TakesScreenshot)driver;
		File sh = tk.getScreenshotAs(OutputType.FILE);
		//System.out.println(sh);
		
File d=new File("E:\\New folder\\Out.png");
FileUtils.copyFile(sh, d);
driver.quit();


}}
