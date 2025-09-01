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

public class Lab8_TestNG_1 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("This is before Method");
	  driver.get("https://tutorialsninja.com/demo/index.php");
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Mac (1)")).click();
		WebElement sort=driver.findElement(By.id("input-sort"));
      sort.sendKeys("Name (A - Z)");
      driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before Method");
	  WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is After Method");
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
	  System.out.println("This is before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite");
  }

}
