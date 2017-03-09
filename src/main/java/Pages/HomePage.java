package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    final WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy(how = How.XPATH,using = ".//*[@id='Layer_1']")
    public WebElement logo;

    @FindBy(how = How.XPATH,using = "//title")
    public WebElement title;


}
