import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    private WebDriver driver;

    @Test
    public void setUp() {
        System.out.println("Przed klasą");
        String driverPath = "src/main/resources/executables/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("https://www.google.com");
        WebElement serchInput = driver.findElement(By.name("q"));
        serchInput.sendKeys("Selenium");
        serchInput.sendKeys(Keys.ENTER);
        driver.findElement(By.partialLinkText("Selenium")).click();
//        Assert.assertEquals(driver.getTitle(), "Selenium - Web Browser Automation" );
//        String expectedTitle = "Selenium - Web Browser Automation";
//        System.out.println(driver.getTitle());
        }
//    @AfterClass
//    public void tearDown(){
//        System.out.println("Po klasie");
//        driver.quit();

}
