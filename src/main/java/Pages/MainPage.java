package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MainPage {

    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = ".//*[@class='feature-card mod-services']")
    private WebElement buttonServise;

    @FindBy(how = How.XPATH, using = ".//*[@class='feature-card mod-practices']")
    private WebElement buttonPractices;

    @FindBy(how = How.XPATH, using = ".//*[@class='feature-card mod-industries']")
    private WebElement buttonIndustries;

    @FindBy(how = How.XPATH, using = ".//*[@class='btn mod-orange'][contains(text(),'Дізнатися')]")
    private WebElement buttonClientGrid;

    @FindBy(how = How.XPATH, using = ".//*[@class='grid-item mod-large']")
    private WebElement laGalaxyPicture;

    @FindBy(how = How.XPATH, using = ".//*[contains(@style,'harmonic-f')]")
    private WebElement harmoticPicture;

    @FindBy(how = How.XPATH, using = ".//div[@class='grid-item-image'][contains(@style,'research')]")
    private WebElement researchPicuare;

    @FindBy(how = How.XPATH, using = ".//div[@class='grid-item-image'][contains(@style,'economist')]")
    private WebElement economistPicture;

    @FindBy(how = How.XPATH, using = ".//div[@class='grid-item-image'][contains(@style,'instabeat')]")
    private WebElement instabeatPicture;

    @FindBy(how = How.XPATH, using = ".//div[@class='grid-item-image'][contains(@style,'stellar')]")
    private WebElement stellarPicture;

    @FindBy(how = How.XPATH, using = ".//div[@class='grid-item-image'][contains(@style,'innovation_portada')]")
    private WebElement bayInnovationPicture;

    @FindBy(how = How.XPATH, using = ".//div[@class='grid-item-image'][contains(@style,'Cochlear_featured')]")
    private WebElement cochlearPicture;

    @FindBy(how = How.XPATH, using = ".//div[@class='grid-item-image'][contains(@style,'see-more')]")
    private WebElement seeMorePicture;


    @FindBy(how = How.XPATH, using = ".//*[@class='btn mod-orange'][contains(text(),'Більше')]")
    private WebElement newsAndInsightsButton;

    @FindBy(how = How.XPATH, using = ".//*[@class='btn mod-orange-alt']")
    private WebElement workWithUsButton;


    @FindBy(how = How.XPATH, using = ".//*[@class='essb_item essb_link_linkedin nolightbox']")
    private WebElement shareLinkedin;

    @FindBy(how = How.XPATH, using = ".//*[@class='essb_item essb_link_twitter nolightbox']")
    private WebElement sharetwitter;

    @FindBy(how = How.XPATH, using = ".//*[@class='essb_item essb_link_facebook nolightbox']")
    private WebElement sharefacebook;

    @FindBy(how = How.XPATH, using = ".//*[@class='essb_item essb_link_mail nolightbox']")
    private WebElement shareMail;


    public void clickButtonService() {
        buttonServise.click();
    }

    public void clickButtonPractices() {
        buttonPractices.click();
    }

    public void clickButtonIndustries() {
        buttonIndustries.click();
    }

    public void clickButtonClientGrid() {
        buttonClientGrid.click();
    }

    public boolean isDisplayedLaGalaxyPicture() {
        return laGalaxyPicture.isDisplayed();
    }
    public boolean isDisplayedHarmoticPicture() {
        return harmoticPicture.isDisplayed();
    }
    public boolean isDisplayedResearchPicuare() {
        return researchPicuare.isDisplayed();
    }
    public boolean isDisplayedEconomistPicture() {
        return economistPicture.isDisplayed();
    }
    public boolean isDisplayedInstabeatPicture() {
        return instabeatPicture.isDisplayed();
    }
    public boolean isDisplayedStellarPicture() {
        return stellarPicture.isDisplayed();
    }
    public boolean isDisplayedBayInnovationPicture() {
        return bayInnovationPicture.isDisplayed();
    }
    public boolean isDisplayedCochlearPicture() {
        return cochlearPicture.isDisplayed();
    }
    public boolean isDisplayedSeeMorePicture() {
        return seeMorePicture.isDisplayed();
    }
    public void clickButtonNewsAndInsightsButton() {
        newsAndInsightsButton.click();
    }
    public void clickButtonWorkWithUsButton(){
        workWithUsButton.click();
    }

    public WebElement getShareLinkedin() {
        return shareLinkedin;
    }

    public WebElement getSharetwitter() {
        return sharetwitter;
    }

    public WebElement getSharefacebook() {
        return sharefacebook;
    }

    public WebElement getShareMail() {
        return shareMail;
    }

    public String share() {
//        String originalWindow =driver.getWindowHandle();
        final Set<String> oldWindowsSet = driver.getWindowHandles();
        driver.findElement(By.xpath(".//*[@class='essb_item essb_link_twitter nolightbox']")).click();

        String newWindows = (new WebDriverWait(driver, 10)).until(new ExpectedCondition<String>() {
            public String apply(WebDriver webDriver) {
                Set<String> newWindowsSet = driver.getWindowHandles();
                newWindowsSet.removeAll(oldWindowsSet);
                return newWindowsSet.size() > 0 ? newWindowsSet.iterator().next() : null;
            }
        });
        driver.switchTo().window(newWindows);
//        System.out.println("New windows title "+driver.getTitle());
//        driver.close();
//        driver.switchTo().window(originalWindow);
//        System.out.println("old windows title "+driver.getTitle());
        return driver.getTitle();
    }




//    public boolean testPicture() {
//        WebElement goodImage = driver.findElement(By.xpath(".//div[@class='grid-item-image'][contains(@style,'economist')]"));
//        String js = "return (typeof arguments[0].naturalWidth!=\"undefined\" && arguments[0].naturalWidth>0)";
//        Boolean isImageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript(js, goodImage);
////        assertTrue(isImageDisplayed);
//        return isImageDisplayed;
//    }
public boolean isDisplayedsSomePicture(WebElement instabeatPicture) {
    return instabeatPicture.isDisplayed();
}

    public void backspace() {
        driver.navigate().back();
    }



}
