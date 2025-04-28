package Maven_jenkins;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class googleSearch {
	
	WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
    
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    
    
    @Test
    public void TestGoogleSearch() {
    	
    	driver.get("https://google.com");
    	driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Selenium");
    	driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys(Keys.ENTER);
    	
    }
    
    @AfterClass
    public void tearDown() {
    	System.out.println("Testcase executed");
    }

}
