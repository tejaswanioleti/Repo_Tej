package New;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TC010_TestNG {
  @Test(groups= {"smoke"},priority=3,enabled=false)
	public void test1() {
	   System.out.println("This is smoketest1");
	}
	@Test(groups= {"regression"})
	public void test2() {
		System.out.println("This is regressiontest1");
	}
	@Test(groups= {"regression"},priority=1)
	public void test3() {
		System.out.println("This is  regressiontest2");
	}
	@Test(groups= {"smoke"})
	public void test4() {
		System.out.println("This is smoketest2");
	}
}