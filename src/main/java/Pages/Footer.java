package Pages;

import javafx.scene.web.WebView;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Footer {

     WebDriver driver;


    public Footer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

//    @FindBy(how = How.XPATH, using = ".//*[@id='menu-item-6078']")
    @FindBy(xpath =".//*[@id='menu-item-6078']")
    private WebElement whatDoWeServices;

    @FindBy(how = How.XPATH, using = ".//*[@id='menu-item-6087']")
    public WebElement ourProjects;

    @FindBy(how = How.XPATH, using = ".//*[@id='menu-item-6071']")
    public WebElement whoWeAre;

    @FindBy(how = How.XPATH, using = ".//*[@id='menu-item-6095']")
    public WebElement newsAndInsights;

    @FindBy(how = How.XPATH, using = ".//*[@id='menu-item-6094']")
    public WebElement werkWithUs;

    @FindBy(how = How.XPATH, using = ".//*[@id='menu-item-6370']")
    public WebElement contactUs;

    @FindBy(how = How.XPATH, using = ".//*[@id='Capa_1']")
    public WebElement globalNavigation;

    @FindBy(how = How.XPATH, using = ".//*[@href='https://www.globallogic.com']")
    public WebElement englishSite;

    @FindBy(how = How.XPATH, using = ".//*[@href='https://www.globallogic.com/latam']")
    public WebElement espanoiolSite;

    @FindBy(how = How.XPATH, using = ".//*[@href='https://www.globallogic.com/ua/']/span")
    public WebElement uaSite;

    @FindBy(how = How.XPATH, using = ".//*[@href='https://www.globallogic.com/pl/']/span")
    public WebElement plSite;

    @FindBy(how = How.XPATH, using = ".//*[@href='https://www.globallogic.com/il/']/span")
    public WebElement israelSite;


    public void clickWhatDoWeServices() {
        whatDoWeServices.click();
    }


}
