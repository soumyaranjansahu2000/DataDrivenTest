package excelReading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting extends BaseTest
{
	public WebDriver driver;
  @Test(dataProvider ="Excel",dataProviderClass = CostomData.class)
  public void testdatadriven(String username,String password) throws InterruptedException {
	  driver = new ChromeDriver();
	  //driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Failed" + test.fail("LoginTestFail"));
	  System.out.println("Login Successfull");
	  test.pass("LoginTest Pass");
	  
	 
  }
  @AfterMethod
  public void amethod()
  
  {
	 driver.quit();
	  
  }
 
  }

