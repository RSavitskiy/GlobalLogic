

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class TestShare {


    public WebDriver driver;

    @BeforeMethod
    public void open() {
        driver = new FirefoxDriver();
    }

    @Test
    public void someTest(){

        driver.get("https://www.globallogic.com/ua/");

        String originalWindows =driver.getWindowHandle();
        final Set<String>oldWindowsSet=driver.getWindowHandles();
        driver.findElement(By.xpath(".//*[@class='essb_item essb_link_twitter nolightbox']")).click();

        String newWindows =(new WebDriverWait(driver,10)).until(new ExpectedCondition<String>() {
            public String apply(WebDriver webDriver) {
                Set<String>newWindowsSet=driver.getWindowHandles();
                newWindowsSet.removeAll(oldWindowsSet);
                return newWindowsSet.size()>0 ? newWindowsSet.iterator().next():null;
            }
        });

        driver.switchTo().window(newWindows);
        System.out.println("New windows title "+driver.getTitle());
        driver.close();
        driver.switchTo().window(originalWindows);
        System.out.println("old windows title "+driver.getTitle());
    }


    @Test
    public boolean testPicture(){



        WebElement goodImage = driver.findElement(By.xpath(".//*[contains(@src,'Stryker')]"));
        String js = "return (typeof arguments[0].naturalWidth!=\"undefined\" && arguments[0].naturalWidth>0)";
        Boolean isImageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript(js, goodImage);
//        assertTrue(isImageDisplayed);
        return isImageDisplayed;


    }

    @AfterMethod
    public void close(){
        driver.quit();
    }
}
