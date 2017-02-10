package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTestBrowser {

	
	@Test
	public void start_browser() throws InterruptedException{
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kapildev\\Downloads\\geckodriver.exe");
	   // WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kapildev\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://go.galegroup.com/ps/start.do?u=test_automation&p=AONE");
	    driver.findElement(By.cssSelector("#password")).sendKeys("qa");
	    driver.findElement(By.cssSelector(".btn-primary.btn-block")).click();
	    driver.findElement(By.xpath(".//*[@id='inputFieldValue_0']")).sendKeys("science");
	    driver.findElement(By.cssSelector("#homepage_submit")).click();
	    WebElement docTitle = driver.findElement(By.cssSelector(".citation-view:nth-child(1) .titleWrapper a")); 
	    String documentTitle = docTitle.getText();
	    docTitle.click();
	    String documentPageTitle = driver.findElement(By.id("docSummary-title")).getText();
	    Assert.assertEquals(documentPageTitle, documentTitle);
	   String ftLabel = driver.findElement(By.cssSelector(".ParaTypeDecorator.rs_skip")).getText();
	   Assert.assertEquals(ftLabel, "Full Text: ");
	    
	    
	    
	    
	/*	driver.get("http://hris.qait.com");
		Thread.sleep(5000);
		driver.findElement(By.id("txtUserName")).sendKeys("kapildev");
		driver.findElement(By.id("txtPassword")).sendKeys("Cengage12");
		driver.findElement(By.name("Submit")).submit();*/
		
		
		//((JavascriptExecutor)driver).executeScript("document.getElementsByClassName('input-block-level')[0].value=\"abcd\";");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kapildev\\Downloads\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.co.in");
		
		//driver.findElement(By.className("gsfi")).sendKeys("QA InfoTech");
				
				
				
	}
}


