package testing;

import org.testng.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class  TestClass1 {
	
	public static WebDriver driver;
	@BeforeMethod
	public void LaunchDriver()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		
	}
	
	@Test
	public void Test1()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("This is first test"+driver.getTitle());
	}
	@Test
	public void Test2()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("This is second test"+driver.getTitle());
	}
	@Test
	public void Test3()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("This is third  test"+driver.getTitle());
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
