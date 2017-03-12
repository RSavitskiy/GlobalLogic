package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import java.util.List;
import java.util.concurrent.TimeUnit;



// Class don`t work (not finished)
public class MainPageCarousel {
    WebDriver driver;

    public MainPageCarousel(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = ".//*[@class='orbit-bullets']")
    private WebElement allNaviBullets;

    @FindBy(how = How.XPATH, using = ".//*[contains(@style,'GL_Linux')]")
    private WebDriver pictureLinux;

    @FindBy(how = How.XPATH, using = ".//*[contains(@style,'LA-Galaxy')]")
    private WebDriver pictureGalaxy;

    @FindBy(how = How.XPATH, using = ".//*[contains(@style,'avid-carousel')]")
    private WebDriver pictureEasy;

    @FindBy(how = How.XPATH, using = ".//*[contains(@style,'harmonic')]")
    private WebDriver pictureHarmonic;

    @FindBy(how = How.XPATH, using = ".//*[contains(@style,'research')]")
    private WebDriver pictureResearch;

    @FindBy(how = How.XPATH, using = ".//*[contains(@style,'hero')]")
    private WebDriver pictureHero;


    public boolean workingNaviButton(String button, String picture) throws InterruptedException {
        boolean ret = false;
        driver.findElement(By.xpath(".//*[@class='orbit-bullets']/button[" + button + "]")).click();
//        driver.findElement(By.xpath(picture)).isDisplayed();
        if (driver.findElement(By.xpath(picture)).isDisplayed()) {
            ret = true;

//        List<WebElement> buttonList = driver.findElements(By.xpath(".//*[@class='orbit-bullets']/button"));
//        boolean ret = false;
//        for (int i = 0; i < buttonList.size(); i++) {
//            buttonList.get(i).click();
//            if (driver.findElement(By.xpath(".//*[contains(@style,'research')]")).isDisplayed()) {
//                ret = true;
//                break;
//            }
//        }
        }
        return ret;
    }

    public void workWithCarousel() {
        List<WebElement> buttonList = driver.findElements(By.xpath(".//*[@class='orbit-bullets']/button"));
        for (WebElement element : buttonList) {
            System.out.println(element.getAttribute("data-slide") + "   " + element.isSelected());
            if (element.getAttribute("data-slide").equals("0")) {
                element.click();
                System.out.println(driver.findElement(By.xpath(".//*[contains(@style,'LA-Galaxy')]")).isDisplayed());
                break;
            }
        }
    }
}

