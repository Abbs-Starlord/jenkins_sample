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
		
		//System.setProperty("webdriver.gecko.driver","/User/umerabbs/Downloads/geckodriver");
		
		//System.setProperty("webdriver.gecko.driver","/Users/umerabbs/Documents/workspace/testJava/geckodriver");
		System.setProperty("webdriver.gecko.driver","./geckodriver");
		
		
		//String path = System.getProperty("user.dir") + "/Users/umerabbs/Documents/workspace/testJava/geckodriver";
		//System.setProperty("webdriver.gecko.driver", path);
		
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();

		
		//driver.get("http://seleniumhq.org/");
		//String appUrl = "https://accounts.google.com";
		//driver.manage().window().maximize();
		
		String appUrl = "http://google.com";
	    driver.get(appUrl);
	    
	    //driver.findElement(By.name("q")),sendKeys("download selenium");
	    //driver.findElement(By.name("q")).sendKeys("download selenium");
	    //Thread.sleep(100);
//	    String title = driver.getTitle();
//	    title.contains("Facebook")
	    //WebElement searchTxtBox = driver.findElement(By.name("q"));
	    //libUtil.waitVisible(driver, searchTxtBox, 10).sendKeys("Download Selenium");
	    libUtil.waitVisible(driver, driver.findElement(By.name("q")), 10).sendKeys("Download Selenium");
	    
	    //driver.findElement(By.name("btnK")).click();
	    //Thread.sleep(2000);
	    
	    //WebElement searchButton = driver.findElement(By.name("btnK"));
	    //libUtil.waitClick(driver, searchButton, 10).click();
	    libUtil.waitClick(driver, driver.findElement(By.name("btnK")), 10).click();


	    
	    System.out.println("Test script executed successfully.");
		driver.close();
	}

}
