import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseSeleniumTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.out.println("Przed klasą");
        String driverPath = "src/main/resources/executables/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Po klasie");
        driver.quit();
    }
}
