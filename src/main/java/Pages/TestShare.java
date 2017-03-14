package Pages;

import org.apache.xpath.SourceTree;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.PackageUtils;

import java.util.Set;

import static org.testng.AssertJUnit.assertTrue;

public class TestShare {


    public WebDriver driver;

    @BeforeMethod
    public void open() {
        driver = new FirefoxDriver();
    }

//    @Test
//    public void someTest(){
//
//        driver.get("https://www.globallogic.com/ua/");
//
//        String originalWinwods =driver.getWindowHandle();
//        final Set<String>oldWindowsSet=driver.getWindowHandles();
//        driver.findElement(By.xpath(".//*[@class='essb_item essb_link_twitter nolightbox']")).click();
//
//        String newWendows =(new WebDriverWait(driver,10)).until(new ExpectedCondition<String>() {
//            public String apply(WebDriver webDriver) {
//                Set<String>newWindowsSet=driver.getWindowHandles();
//                newWindowsSet.removeAll(oldWindowsSet);
//                return newWindowsSet.size()>0 ? newWindowsSet.iterator().next():null;
//            }
//        });
//
//        driver.switchTo().window(newWendows);
//        System.out.println("New windows title "+driver.getTitle());
//        driver.close();
//        driver.switchTo().window(originalWinwods);
//        System.out.println("old windows title "+driver.getTitle());
//    }


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
