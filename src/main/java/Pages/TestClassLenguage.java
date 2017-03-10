package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestClassLenguage {


    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.globallogic.com/ua/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath(".//*[@id='Capa_1']")).click();
        driver.findElement(By.xpath(".//*[@href='https://www.globallogic.com']")).click();
        System.out.println(driver.getTitle().toString());




        driver.close();
    }
}