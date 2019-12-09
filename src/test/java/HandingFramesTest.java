import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


public class HandingFramesTest extends BaseSeleniumTest{
        @Test
        public void handlingFrameTest() {
                driver.get("file:/home/mariusz/Pulpit/iFrameTest.html");
                driver.switchTo().frame(0);
                WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
                clickOnMeButton.click();
                driver.switchTo().alert().accept();
               // driver.switchTo().defaultContent();
                List<WebElement> headers = driver.findElements(By.tagName("h1"));
                System.out.println(headers.size());
                System.out.println(headers.get(0).getText());
        }
}
