package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestClassLenguage {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.globallogic.com/ua/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath(".//*[@id='Capa_1']")).click();
        Thread.sleep(3000);

        WebElement lengue=driver.findElement(By.xpath(".//*[contains(@class,'nav-country-selector-option')]"));
        List<WebElement>leng=lengue.findElements(By.xpath(".//*[contains(@href,'https://www.globallogic.com/')]/span"));
//        driver.findElement(By.xpath(".//*[@href='https://www.globallogic.com']")).click();
//        System.out.println(driver.getTitle().toString(""));

        System.out.println(leng.size());

//        .//*[contains(@class,'nav-country-selector-option')]
//        .//*[@href='https://www.globallogic.com/latam']

//        .//*[contains(@href,'https://www.globallogic.com/')]
        driver.close();
    }
}