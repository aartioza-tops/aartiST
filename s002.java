package proj1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\admin\\Desktop\\st\\chromedriver_win32");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		
		String expectedTitle = "Log in to Facebook";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		System.out.println(expectedTitle);
		System.out.println(actualTitle);
	}

}
