package DownloadData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Download {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://auth.spectrumxg.com/login?returnTo=venona-dashboard.spectrumxg.com/specguide/overview");
//		if(driver.getTitle().equals("Spectrum")){
//			System.out.println("Login page opened");
			driver.findElement(By.xpath("//*[@id='email-input']")).sendKeys("P2778031");
			driver.findElement(By.xpath("html/body/div[2]/div[1]/div/form/div[2]/input")).sendKeys("Mar@2018");
			driver.findElement(By.xpath("html/body/div[2]/div[1]/div/form/div[3]/button")).click();
		//}
		//driver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div[1]/span/span")).click();
//		WebElement el=driver.findElement(By.xpath("//span[@class='fa fa-bars']"));
//		System.out.println(el);
//		Actions action=new Actions(driver);
//		action.moveToElement(el).click();
		WebElement faCal=driver.findElement(By.xpath("//*[@id='app']/div/div/div[3]/div/div/div[1]/div/div[1]/div[3]/span[2]/span"));
		System.out.println(faCal);
		Actions action=new Actions(driver);
		action.moveToElement(faCal).click(faCal).perform();
	}

}
