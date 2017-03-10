package Pages;

import javafx.scene.web.WebView;
import org.omg.CORBA.PUBLIC_MEMBER;
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


    @FindBy(xpath = ".//*[@id='menu-item-6078']")
    private WebElement whatDoWeServices;

    @FindBy(how = How.XPATH, using = ".//*[@id='menu-item-6087']")
    private WebElement ourProjects;

    @FindBy(how = How.XPATH, using = ".//*[@id='menu-item-6071']")
    private WebElement whoWeAre;

    @FindBy(how = How.XPATH, using = ".//*[@id='menu-item-6095']")
    private WebElement newsAndInsights;

    @FindBy(how = How.XPATH, using = ".//*[@id='menu-item-6094']")
    private WebElement workWithUs;

    @FindBy(how = How.XPATH, using = ".//*[@id='menu-item-6370']")
    private WebElement contactUs;

    @FindBy(how = How.XPATH, using = ".//*[@id='Capa_1']")
    private WebElement globalNavigation;

    @FindBy(how = How.XPATH, using = ".//*[@href='https://www.globallogic.com']")
    private WebElement englishSite;

    @FindBy(how = How.XPATH, using = ".//*[@href='https://www.globallogic.com/latam']")
    private WebElement espanoiolSite;

    @FindBy(how = How.XPATH, using = ".//*[@href='https://www.globallogic.com/ua/']/span")
    private WebElement uaSite;

    @FindBy(how = How.XPATH, using = ".//*[@href='https://www.globallogic.com/pl/']/span")
    private WebElement plSite;

    @FindBy(how = How.XPATH, using = ".//*[@href='https://www.globallogic.com/il/']/span")
    private WebElement israelSite;


    public void clickWhatDoWeServices() {
        whatDoWeServices.click();
    }

    public void clickOurProjects() {
        ourProjects.click();
    }

    public void clickWhoWeAre() {
        whoWeAre.click();
    }

    public void clickNewsAndInsights() {
        newsAndInsights.click();
    }

    public void clickWerkWithUs() {
        workWithUs.click();
    }

    public void clickContactUs() {
        contactUs.click();
    }

    public void clickGlobalNavigation() {
        globalNavigation.click();
    }

    public void ckickEnglishSite() {
        englishSite.click();
    }

    public void clickEspanoiolSite() {
        espanoiolSite.click();
    }

    public void clickUaSite() {
        uaSite.click();
    }

    public void clickPlSite() {
        plSite.click();
    }

    public void clickIsraelSite() {
        israelSite.click();
    }

    public void backspace() {
        driver.navigate().back();

    }
}