import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseSeleniumTest {
    @Test public void googleSearchTest() {
        driver.get("https://www.google.com");
        WebElement serchInput = driver.findElement(By.name("q"));
        serchInput.sendKeys("SeleniumHQ Browser Automation");
        serchInput.sendKeys(Keys.ENTER);
        driver.findElement(By.partialLinkText("SeleniumHQ Browser Automation")).click();
        String expectedTitle = "SeleniumHQ Browser Automation";
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }
}