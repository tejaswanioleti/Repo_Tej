package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab5_Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php");
		System.out.println("Title:"+driver.getTitle());
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		WebElement heading =driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
		String HeadingText=heading.getText();
		if(HeadingText.equals("Register Account")) {
			System.out.println("Heading Verified:"+HeadingText);
			
		}
		else {
			System.out.println("Heading not Verified:"+HeadingText);
		}
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		WebElement warn=driver.findElement(By.xpath("//*[@id=\"account-register\"]/div[1]"));
		String Warning=warn.getText();
		if(Warning.equals("Warning: You must agree to the Privacy Policy!")){
			System.out.println("Warning Appeared:"+Warning);
		}
		else {
			System.out.println("Warning not Appeared:"+Warning);
			
		}

		driver.close();

	}

}