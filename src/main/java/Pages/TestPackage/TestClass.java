package Pages.TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
    private WebDriver driver;

    @BeforeClass
    public void open(){
        driver=new FirefoxDriver();
        driver.get("https://yandex.ua/");
        driver.manage().window().maximize();
    }
    @Test
    public void fieldSearch(){
        FirstPage firstPage=new FirstPage(driver);
        FindByClass findByClass =new FindByClass();
        Assert.assertEquals("Яндек",driver.getTitle(),"Все верно ");
    }

    @AfterClass
    public void close(){
        driver.close();
    }
}
