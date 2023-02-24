package proj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\admin\\Desktop\\st\\chromedriver_win32");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.name("pass"));
		WebElement login = driver.findElement(By.name("login"));
		
		email.sendKeys("tops@gmail.com");
		pass.sendKeys("tech123");
		login.click();
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
		 driver.close();
		
		 driver.quit();
	}

}
