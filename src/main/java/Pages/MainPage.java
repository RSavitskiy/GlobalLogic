package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPage {

    WebDriver driver;

    public MainPage (WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH,using = ".//*[@class='feature-card mod-services']")
    private WebElement buttonServise;

    @FindBy(how = How.XPATH,using = ".//*[@class='feature-card mod-practices']")
    private WebElement buttonPractices;

    @FindBy(how = How.XPATH,using = ".//*[@class='feature-card mod-industries']")
    private WebElement buttonIndustries;

    @FindBy(how = How.XPATH,using = ".//*[@class='btn mod-orange'][contains(text(),'Дізнатися')]")
    private WebElement buttomClientGrid;

    @FindBy(how = How.XPATH,using = ".//*[@class='grid-item mod-large']")
    private WebElement laGalaxyPicture;

    @FindBy (how = How.XPATH,using = ".//*[contains(@style,'harmonic-f')]")
    private WebElement harmoticPicture;

    @FindBy (how = How.XPATH,using = ".//div[@class='grid-item-image'][contains(@style,'research')]")
    private WebElement researchPicuare;

    @FindBy(how = How.XPATH,using = ".//div[@class='grid-item-image'][contains(@style,'economist')]")
    private WebElement economistPicture;

    @FindBy(how = How.XPATH,using = ".//div[@class='grid-item-image'][contains(@style,'instabeat')]")
    private WebElement instabeatPicture;

    @FindBy(how = How.XPATH,using =".//div[@class='grid-item-image'][contains(@style,'stellar')]")
    private WebElement stellarPicture;

    @FindBy(how = How.XPATH,using = ".//div[@class='grid-item-image'][contains(@style,'innovation_portada')]")
    private WebElement BayInnovationPicture;

    @FindBy(how = How.XPATH,using = ".//div[@class='grid-item-image'][contains(@style,'Cochlear_featured')]")
    private WebElement cochlearPicture;

    @FindBy (how = How.XPATH,using = ".//div[@class='grid-item-image'][contains(@style,'see-more')]")
    private WebElement seeMorePicture;

    @FindBy (how = How.XPATH,using = ".//*[@class='btn mod-orange'][contains(text(),'Більше')]")
    private WebElement newsAndInsightsButton;

    @FindBy (how = How.XPATH,using = ".//*[@class='btn mod-orange-alt']")
    private  WebElement workWithUsButton;








}
