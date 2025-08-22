package New;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Lab5_Part5 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?");
        System.out.println("Launched URL: " + driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='My Account']"))).click();
        System.out.println("Clicked on 'My Account'");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Register']"))).click();
        System.out.println("Clicked on 'Register'");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-firstname"))).sendKeys("Oleti");
        System.out.println("Entered First Name: Oleti");

        driver.findElement(By.id("input-lastname")).sendKeys("Tejaswani");
        System.out.println("Entered Last Name: Tejaswani");

        String email = "oletitejaswani@gmail.com";
        driver.findElement(By.id("input-email")).sendKeys(email);
        System.out.println("Entered Email: " + email);

        driver.findElement(By.id("input-telephone")).sendKeys("9778667567");
        System.out.println("Entered Telephone: 9778667567");

        driver.findElement(By.id("input-password")).sendKeys("Password123");
        System.out.println("Entered Password");

        driver.findElement(By.id("input-confirm")).sendKeys("Password123");
        System.out.println("Entered Confirm Password");

        driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();
        System.out.println("Clicked on 'Yes' Newsletter");

        driver.findElement(By.name("agree")).click();
        System.out.println("Agreed to Privacy Policy");

        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        System.out.println("Clicked on Continue button");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Continue']"))).click();
        System.out.println("Account created successfully, clicked on Continue");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='View your order history']"))).click();
        System.out.println("Clicked on 'View your order history' under My Orders");

        driver.quit();
        System.out.println("Test finished and browser closed.");
    }
}
