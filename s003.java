package proj1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class s003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.drive", "C:\\Users\\admin\\Desktop\\st\\chromedriver_win32");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
	
		
		WebElement signup = driver.findElement(By.linkText("Sign up for Facebook"));
		signup.click();
		
		driver.findElement(By.name("firstname")).sendKeys("tops");
		driver.findElement(By.name("lastname")).sendKeys("tech");
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("S001A@");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("10");
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByIndex(4);
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByValue("2000");
		

		// driver.findElement(By.name("sex")).sendKeys("2");
		
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 driver.close();
			
		 driver.quit();
		

	}

}
