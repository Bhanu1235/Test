
package GitTest.Git;


import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class App {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

 
@BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "http://www.packaging-gateway.com/";
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);                      
}

  @Test
  public void testNew() throws Exception {
    driver.get(baseUrl + "/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.findElement(By.id("cookiepopup-closebutton")).click();
    Thread.sleep(1000);

    driver.findElement(By.xpath(".//*[@id='content-container']/header/div[2]/div[2]/form/fieldset/input")).click();
    
    driver.findElement(By.xpath(".//*[@id='content-container']/header/div[2]/div[2]/form/fieldset/input")).sendKeys("Materials");
    
    driver.findElement(By.xpath(".//*[@id='content-container']/header/div[2]/div[2]/form/fieldset/button")).click();
    
   
    Thread.sleep(100);
   
    
   
    
    //Scrolling Down
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("window.scrollBy(0,2050)");
    
    Thread.sleep(2000);
    
//    // Clicking ABB company
//    driver.findElement(By.xpath("//div[@id='a']/ul/li[4]/a/span")).click();
//    Thread.sleep(2000);
  }
}
    