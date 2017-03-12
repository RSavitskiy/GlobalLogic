package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;



public class TestMainPage_2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.globallogic.com/ua/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> buttonList = driver.findElements(By.xpath(".//*[@class='orbit-bullets']/button"));
        System.out.println(buttonList.size());
        for (WebElement elements : buttonList) {
//            System.out.println(elements.getAttribute("data-slide") + "   " + elements.isSelected());
            if (elements.getAttribute("data-slide").equals("0")) {
                elements.click();
                System.out.println(driver.findElement(By.xpath(".//*[contains(@style,'LA-Galaxy')]")).isDisplayed());
//                if (driver.findElement(By.xpath(".//*[contains(@style,'LA-Galaxy')]")).isDisplayed()) {
//                    System.out.println(driver.findElement(By.xpath(".//*[contains(@style,'LA-Galaxy')]")).isDisplayed());
                break;
            }
        }
        driver.close();
    }
}

