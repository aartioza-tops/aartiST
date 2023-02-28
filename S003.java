package selenium_mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;
public class S003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Driverconnection.connect("https://demoqa.com/webtables");
		String fname = "Cierra";
		WebElement name = driver.findElement(By.xpath("//*[text()='"+fname+"']"));
	
		if(name.isDisplayed()) {
			driver.findElement(By.xpath("//*[text()='"+fname+"']/following-sibling::div[6]/div/span[1]")).click();
		}
		else { 
			System.out.print("not found");
		}
	}

}
