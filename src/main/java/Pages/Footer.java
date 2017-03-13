package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Footer {


    WebDriver driver;


    public Footer(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }


    @FindBy (how = How.XPATH,using = ".//*[contains(@href,'privacy-policy')]")
    private WebElement privacyPoliticyLinc;

    @FindBy(how = How.XPATH,using = ".//*[contains(@href,'terms-of-services')]")
    private  WebElement termsOfServices;

    @FindBy (how = How.XPATH,using = ".//*[contains(@href,'globallogicukraine')]")
    private WebElement Linkedin;

    @FindBy(how = How.XPATH,using = ".//*[contains(@href,'globallogic_ua')]")
    private WebElement twitter;

    @FindBy(how = How.XPATH,using = ".//*[contains(@href,'GlobalLogicUkraine')]")
    private WebElement facebook;


}
