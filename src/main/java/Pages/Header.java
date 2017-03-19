package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Header {

    WebDriver driver;


    public Header(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.XPATH,xpath = ".//*[@id='menu-item-6078']")
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
    private  WebElement globalNavigation;



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

    public void clickWorkWithUs() {
        workWithUs.click();
    }

    public void clickContactUs() {
        contactUs.click();
    }

    public  void clickGlobalNavigation() {
        globalNavigation.click();
    }


    public void backspace() {
        driver.navigate().back();
    }

    public String forGlobal(String value) {
        clickGlobalNavigation();
        WebElement language = driver.findElement(By.xpath(".//*[contains(@class,'nav-country-selector-option')]"));
        List<WebElement> elementLanguage = language.findElements(By.xpath(".//*[contains(@href,'https://www.globallogic.com/')]/span"));
        String title = null;
        for (int i = 0; i < elementLanguage.size(); i++) {
            clickGlobalNavigation();
            if (elementLanguage.get(i).getText().equals(value)) {
                elementLanguage.get(i).click();
                title = driver.getTitle();

                break;
            }
        }
        return title;
    }

    public void waiter(String someXpathLocator){
        WebDriverWait waitForOne=new WebDriverWait(driver,10);
        waitForOne.until(ExpectedConditions.presenceOfElementLocated(By.xpath(someXpathLocator)));
    }
}