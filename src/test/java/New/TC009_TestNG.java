package New;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TC009_TestNG {
	WebDriver driver;
	

  @Test(dataProvider = "logindata")
  public void f(String username, String password) {
	  System.out.println("This is the test");
	    
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement uname=driver.findElement(By.name("username"));
		if(uname.isDisplayed())
		{
			uname.sendKeys("Admin");
		System.out.println("Get placeholder:"+uname.getAttribute("placeholder"));
		}
		else
		{
			System.out.println("username is not displayed");
		}
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("username")).sendKeys(Keys.ENTER);
		WebElement dashboard=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		if(dashboard.isDisplayed()) {
		   Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
  }
  @Test(groups= {"smoke"})
  public void register()
  {
	 System.out.println("This is my registration"); 
  }
  @Test
  public void addtocart()
  {
	 System.out.println("This is my addtocart"); 
  }
  
  @Parameters("browser")
  @BeforeMethod
  public void beforeMethod(String brow) {
	  System.out.println("This is before method");
		if(brow.equalsIgnoreCase("chrome"))
		  {
		   WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		  }
		  if(brow.equalsIgnoreCase("edge"))
		  {
		  WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		  }
		  if(brow.equalsIgnoreCase("firefox"))
		  {
		  WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		  }

	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  
   
  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is After method");
	  driver.quit();
  }


  @DataProvider
  public Object[][] logindata() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Pooja", "Welcome" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is After suite");
  }

}
