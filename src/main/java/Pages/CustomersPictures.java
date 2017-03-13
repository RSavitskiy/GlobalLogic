package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CustomersPictures {

    WebDriver driver;

    public CustomersPictures (WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH,using = ".//*[contains(@src,'Stryker')]")
    private WebElement stryker;

    @FindBy(how = How.XPATH,using = ".//*[contains(@src,'LA_Galaxy')]")
    private  WebElement laGalaxy;

    @FindBy(how = How.XPATH,using = ".//*[contains(@src,'cisco')]")
    private  WebElement cisco;

    @FindBy(how = How.XPATH,using = ".//*[contains(@src,'avid')]")
    private  WebElement avid;

    @FindBy(how = How.XPATH,using = ".//*[contains(@src,'verizon')]")
    private  WebElement verizon;

    @FindBy(how = How.XPATH,using = ".//*[contains(@src,'microsoft')]")
    private  WebElement microsoft;

    @FindBy(how = How.XPATH,using = ".//*[contains(@src,'coca-cola')]")
    private  WebElement cocaCola;

    @FindBy(how = How.XPATH,using = ".//*[contains(@src,'bmc')]")
    private  WebElement bmc;

    @FindBy(how = How.XPATH,using = ".//*[contains(@src,'kohls')]")
    private  WebElement kohls;
}

