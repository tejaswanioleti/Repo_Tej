package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	  /* driver.get("https://tutorialsninja.com/demo/index.php?");
	     System.out.println("title is"+driver.getTitle());
	     driver.navigate().to("https://www.yahoo.com/");
	     System.out.println("title is"+driver.getTitle());
	     driver.navigate().back();
	     System.out.println("title is"+driver.getTitle());
	     driver.navigate().forward();
	     System.out.println("title is"+driver.getTitle());*/
	     driver.get("https://www.google.com");
	     System.out.println("title is "+driver.getTitle());
	     System.out.println("url is "+driver.getCurrentUrl());
	     System.out.println("page source is "+driver.getPageSource());
	     
	}

}
