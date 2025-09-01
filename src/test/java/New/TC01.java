package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TC01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Title:"+driver.getTitle());
		
		

	}

}
