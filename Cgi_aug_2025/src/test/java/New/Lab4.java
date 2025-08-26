package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
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
		Thread.sleep(2000);
		driver.findElement(By.id("input-search")).clear();
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[1]/label/input")).click();
		driver.findElement(By.id("button-search")).click();
		WebElement macheading=driver.findElement(By.xpath("//*[@id=\"content\"]/h2"));
		if(macheading.isDisplayed()) {
			System.out.println("successfully verified mac heading: ");
			
		}else {
			System.out.println("macheading not displayed");
		}
		Thread.sleep(2000);
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

}
