package demo.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class selen {
	
	@Test
	public void test1() throws InterruptedException{
		
		
		System.setProperty("webdriver.gecko.driver","./geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
	    System.out.println("Opening Google");

		String appUrl = "http://google.com";
	    driver.get(appUrl);
	    
	    
	    libUtil.waitVisible(driver, driver.findElement(By.name("q")), 10).sendKeys("Download Selenium");
	    
	    libUtil.waitClick(driver, driver.findElement(By.name("btnK")), 10).click();


	    
	    System.out.println("Test script executed successfully.");
		driver.close();
	}

}
