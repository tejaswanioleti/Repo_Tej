package New;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("oletitejaswani@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Components")).click();
		driver.findElement(By.linkText("Monitors (2)")).click();
		
		WebElement showdropdown = driver.findElement(By.id("input-limit"));
		showdropdown.sendKeys("25");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[1]/div/div[2]/div[2]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Specification")).click();
		
		WebElement specifyTab=driver.findElement(By.id("tab-specification"));
		if(specifyTab.isDisplayed()) {
			System.out.println("Specification details are displayed"+specifyTab);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		WebElement verifysuccess=driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]"));
		if(verifysuccess.isDisplayed()) {
			System.out.println("message :"+verifysuccess.getText());
		}
		WebElement mobilesearch=driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
		mobilesearch.sendKeys("Mobile");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		driver.findElement(By.xpath("//*[@id=\"description\"]")).click(); //search for product description
		driver.findElement(By.id("button-search")).click();
		driver.findElement(By.linkText("HTC Touch HD")).click();
		WebElement qty = driver.findElement(By.xpath("//*[@id=\"input-quantity\"]"));
		qty.clear();
		qty.sendKeys("3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a")).click();
		if(driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr")).isDisplayed()) {
			System.out.println("Displayed correctly");
		}
		Thread.sleep(3000);
		driver.findElement(By.linkText("Checkout")).click();
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Account logged out successfully");
		if(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).isDisplayed()) {
			System.out.println("Account logout displayed");
			
		}
		Thread.sleep(3000);
		driver.findElement(By.linkText("Continue")).click();
		driver.quit();

}
}