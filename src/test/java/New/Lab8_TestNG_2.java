package New;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab8_TestNG_2 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s){
	  driver.get("https://tutorialsninja.com/demo/index.php");
		System.out.println("Title is"+driver.getTitle());
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Mac (1)")).click();
		WebElement sort=driver.findElement(By.id("input-sort"));
      sort.sendKeys("Name (A - Z)");
      driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]")).click();
		WebElement mobile=driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
		mobile.sendKeys("Mobile");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		
		driver.findElement(By.id("input-search")).clear();
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[1]/label/input")).click();
		driver.findElement(By.id("button-search")).click();
		WebElement macheading=driver.findElement(By.xpath("//*[@id=\"content\"]/h2"));
		if(macheading.isDisplayed()) {
			System.out.println("successfully verified mac heading: ");
			
		}else {
			System.out.println("macheading not displayed");
		}
		
		WebElement mobile1=driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
		mobile1.clear();
		mobile1.sendKeys("Monitors");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		WebElement macheading1=driver.findElement(By.xpath("//*[@id=\"content\"]/h2"));
		if(macheading1.isDisplayed()) {
			System.out.println("successfully verified mac heading: ");
			
		}else {
			System.out.println("macheading not displayed");
		}
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method");
	  WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is After method");
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }

}
