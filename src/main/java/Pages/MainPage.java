package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPage {
    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.XPATH,xpath = ".//small-12 columns[@data-slide='0']")
    .//*[@data-slide='0']
    private WebElement whatDoWeServices;
    //input[@id='username']
    .//input[@data-slide='0']
            .//nav[data-slide='0']

            .//button[contains(text(),data-slide='1')]


}
