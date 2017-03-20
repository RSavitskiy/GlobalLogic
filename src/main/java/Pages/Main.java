package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Main {

    static public WebDriver driver;

  public   HomePage homePage;
//    Header footer;

    @BeforeSuite
    public void beforeSuite() {
        driver = new FirefoxDriver();
        driver.get("https://www.globallogic.com/ua/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        homePage = PageFactory.initElements(driver, HomePage.class);

    }

    @AfterSuite
    public void afterSuite() {
        driver.close();
    }




}
