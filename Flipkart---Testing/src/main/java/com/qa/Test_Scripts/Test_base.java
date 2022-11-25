package com.qa.Test_Scripts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.qa.pages.Search;


public class Test_base {
	

	
	


		WebDriver driver;
		Search ebay;
		@Parameters({"Browser", "Url"})
		@BeforeClass
		public void setUp(String Browser,String  Url) throws InterruptedException, FileNotFoundException {
			
			
			if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sumamukesh\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			driver=new ChromeDriver();
			}
			
			

			driver.get(Url);
			driver.manage().window().maximize();
			String title=driver.getTitle();
			System.out.println(title);
			
			
			
		}

	public void CaptureScreenshots(WebDriver driver,String tName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tName+".png");
		FileUtils.copyFile(source, target);
	}

	public boolean isElementPresent(By by) {
	    try {
	        driver.findElement(by);
	        return true;
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	}
@AfterClass
		public void tearDown() throws InterruptedException {
			Thread.sleep(10000);
		driver.close();

		
		}
	}



